package com.hawksjamesf.network

import com.squareup.moshi.JsonClass

//@JsonClass(generateAdapter = true)
data class Bean(
        var eventContent: EventContent,
        var eventType: String, // bugly_tag
        var isEncrypt: Int, // 0
        var signature: String, // ACE346A4AE13A23A52A0D0D19350B466AF51728A
        var timestamp: Long // 1462780713515
)