package com.electrolytej.spacecraft.network.model

data class Profile(
        val id: Int,
        val mobile: String,
        var token: String?,
        var refreshToken: String?
) {
    override fun toString(): String {
        return "Profile(id=$id, mobile='$mobile', token=$token, refreshToken=$refreshToken)"
    }
}