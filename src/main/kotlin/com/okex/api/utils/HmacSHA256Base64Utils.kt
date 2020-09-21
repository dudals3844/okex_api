package com.okex.api.utils

import com.okex.api.const.APIConstants
import com.okex.api.enum.AlgorithmEnum
import com.okex.api.enum.CharsetEnum
import com.okex.api.enum.getAlgorithm
import com.okex.api.enum.getCharset
import org.apache.commons.lang3.StringUtils
import java.lang.Error
import javax.crypto.Mac
import java.security.NoSuchAlgorithmException
import java.util.*
import javax.crypto.spec.SecretKeySpec
import javax.management.RuntimeErrorException

open class HmacSHA256Base64Utils{
    var MAC: Mac? = null
    init {
        try {
            MAC = Mac.getInstance(getAlgorithm(AlgorithmEnum.HMAC_SHA256))
        } catch (e: NoSuchAlgorithmException){
            throw RuntimeErrorException(Error("Can't get MAC instance"))
        }
    }

    open fun preHash(timestamp: String, method: String, requestPath: String, queryString: String, body: String): String{
        var preHash: StringBuilder = StringBuilder()
        var apiConstants = APIConstants()
        preHash.append(timestamp)
        preHash.append(method.toUpperCase())
        preHash.append(requestPath)

        if (StringUtils.isNotEmpty(queryString)){
            preHash.append(apiConstants.QUESTION).append(queryString)
        }

        if (StringUtils.isNotEmpty(body)){
            preHash.append(body)
        }

        return preHash.toString()
    }

    open fun sign(timestamp: String, method: String, requestPath: String, queryString: String, body: String, scretKey: String): String{
        var apiConstants = APIConstants()
        if (StringUtils.isEmpty(scretKey) || StringUtils.isEmpty(method)){
            return apiConstants.EMPTY
        }
        var preHash: String = preHash(timestamp, method, requestPath, queryString, body)
        var secretKeyBytes: ByteArray = scretKey.toByteArray(Charsets.UTF_8)

        var secretKeySpec: SecretKeySpec = SecretKeySpec(secretKeyBytes, getAlgorithm(AlgorithmEnum.HMAC_SHA256))
        var mac: Mac = MAC?.clone() as Mac
        mac.init(secretKeySpec)
        return Base64.getEncoder().encodeToString(mac.doFinal(preHash.toByteArray(Charsets.UTF_8)))
    }




}