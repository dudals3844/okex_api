package com.okex.api.client

import com.okex.api.config.APIConfiguration
import com.okex.api.config.APICredentials
import com.okex.api.const.APIConstants
import com.okex.api.enum.ContentTypeEnum
import com.okex.api.enum.HttpHeadersEnum
import com.okex.api.exception.APIException
import com.okex.api.utils.HmacSHA256Base64Utils
import okhttp3.*
import okio.Buffer
import okio.IOException
import org.apache.commons.lang3.StringUtils
import org.slf4j.LoggerFactory
import java.lang.StringBuilder
import java.security.InvalidKeyException

open class APIHttpClient{
    val LOG = LoggerFactory.getLogger(APIHttpClient::class.java)
    var config =  APIConfiguration("5")
    val credentials: APICredentials?
    var simulated: String = "1"


    constructor(config: APIConfiguration, credentials: APICredentials){
        this.config = config
        this.credentials = credentials
    }

    fun headers(request: Request, timestamp: String): Headers{
        var builder: Headers.Builder = Headers.Builder()
        var apiConstants = APIConstants()
        builder.add(apiConstants.ACCEPT, ContentTypeEnum.APPLICATION_JSON.contentType)
        builder.add(apiConstants.CONTENT_TYPE, ContentTypeEnum.APPLICATION_JSON_UTF8.contentType)
        builder.add(apiConstants.COOKIE, this.getCookie())

        if (StringUtils.isNotEmpty(credentials!!.secretKey)){
            builder.add(HttpHeadersEnum.OK_ACCESS_KEY.header, credentials.apiKey!!)
            builder.add(HttpHeadersEnum.OK_ACCESS_SIGN.header, this.sign(request, timestamp))
            builder.add(HttpHeadersEnum.OK_ACCESS_TIMESTAMP.header, timestamp)
            builder.add(HttpHeadersEnum.OK_ACCESS_PASSPHRASE.header, this.credentials.passphrase!!)
//            builder.add("x-simulated-trading","1")
//            println("-----------simulated trading----------------")
        }

        return builder.build()
    }

    fun getCookie(): String{
        val cookie: StringBuilder = StringBuilder()
        val apiConstants = APIConstants()
        cookie.append(apiConstants.LOCALE).append(config.i18n)
        return cookie.toString()
    }

    fun sign(request: Request, timestamp: String): String{
        val sign: String
        val hmacSHA256Base64Utils = HmacSHA256Base64Utils()
        try {
            sign = hmacSHA256Base64Utils.sign(timestamp, this.method(request), this.requestPath(request),
                                                this.queryString(request), this.body(request), this.credentials!!.secretKey!!)
        } catch (e: IOException){
            throw APIException("Request get body io exception.", e)
        } catch (e: CloneNotSupportedException){
            throw APIException("Hmac SHA256 BASE 64 Signature clone not supported", e)
        } catch (e: InvalidKeyException){
            throw APIException("Hmac SHA256 BASE 64 Signature invalid key exception",e)
        }
        return sign
    }

    fun method(request: Request): String{
        return request.method.toUpperCase()
    }

    fun url(request: Request): String{
        return request.url.toString()
    }

    fun requestPath(request: Request): String{
        var url: String = this.url(request)
        var apiConstants = APIConstants()
        url = url.replace(this.config.endpoint, apiConstants.EMPTY)
        var requestPath: String = url
        if (requestPath.contains(apiConstants.QUESTION)){
            requestPath = requestPath.substring(0, url.lastIndexOf(apiConstants.QUESTION))
        }
        if (config.endpoint.endsWith(apiConstants.SLASH)){
            requestPath = apiConstants.SLASH + requestPath
        }

        return requestPath
    }

    fun queryString(request: Request): String{
        val url: String = url(request)
        request.body
        val apiConstants = APIConstants()
        var queryString: String = apiConstants.EMPTY
        if (url.contains(apiConstants.QUESTION)){
            queryString = url.substring(url.lastIndexOf(apiConstants.QUESTION) + 1)
        }

        return queryString
    }

    fun body(request: Request): String{
        var requestBody: RequestBody? = request.body
        var apiConstants = APIConstants()
        var body: String = apiConstants.EMPTY
        if (requestBody != null){
            val buffer: Buffer = Buffer()
            requestBody.writeTo(buffer)
            body = buffer.readString(apiConstants.UTF_8)
        }
        return body
    }

}