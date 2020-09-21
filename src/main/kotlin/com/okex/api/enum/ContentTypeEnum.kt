package com.okex.api.enum

enum class ContentTypeEnum(val contentType: String){

    APPLICATION_JSON("application/json"),
    APPLICATION_JSON_UTF8("application/json; charset=UTF-8"),
    APPLICATION_FORM("application/x-www-form-urlencoded; charset=UTF-8")

}

fun getContentType(c: ContentTypeEnum): String{
    when(c){
        ContentTypeEnum.APPLICATION_JSON -> return c.contentType
        ContentTypeEnum.APPLICATION_JSON_UTF8 -> return c.contentType
        ContentTypeEnum.APPLICATION_FORM -> return c.contentType
    }
}