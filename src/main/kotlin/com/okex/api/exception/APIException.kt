package com.okex.api.exception

class APIException : RuntimeException {
    private var code = 0

    constructor(message: String?) : super(message) {}
    constructor(code: Int, message: String?) : super(message) {
        this.code = code
    }

    constructor(cause: Throwable?) : super(cause) {}
    constructor(message: String?, cause: Throwable?) : super(message, cause) {}

    override val message: String
        get() = if (code != 0) {
            code.toString() + " : " + super.message
        } else super.message!!
}