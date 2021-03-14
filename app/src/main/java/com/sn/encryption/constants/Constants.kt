package com.sn.encryption.constants

enum class EncType {
    AESENCRYPT,
    AESALTENCRYPT,
    RSAENCRYPT
}

object EncryptConstants{
    const val SALT_VALUE = "salt_value"
    const val IV_VALUE = "iv_value"
    const val ENC_VALUE = "encrypt_value"
}