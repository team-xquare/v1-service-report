package xquare.com.infrastructure.error

data class BaseException(
    val status: Int = 500,
    val message: String = "Internal Server Error"
)