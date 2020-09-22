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

open class Sign{

    fun getSign(timestamp: String, method: String, requestPath: String, queryString: String, body: String, scretKey: String): String{
        val sign: String
        val hmacSHA256Base64Utils = HmacSHA256Base64Utils()
        try {
            sign = hmacSHA256Base64Utils.sign(timestamp, method, requestPath, queryString, body, scretKey)
        } catch (e: IOException){
            throw APIException("Request get body io exception.", e)
        } catch (e: CloneNotSupportedException){
            throw APIException("Hmac SHA256 BASE 64 Signature clone not supported", e)
        } catch (e: InvalidKeyException){
            throw APIException("Hmac SHA256 BASE 64 Signature invalid key exception",e)
        }
        return sign
    }





}