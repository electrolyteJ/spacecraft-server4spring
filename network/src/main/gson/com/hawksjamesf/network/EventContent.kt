package com.hawksjamesf.network

import com.squareup.moshi.JsonClass

//@JsonClass(generateAdapter = true)
data class EventContent(
        var appId: String, // 1104512706 appId
        var appName: String, // AF app名称
        var appUrl: String, // http://bugly.qq.com/issueIndex?app=1104512706&pid=1&ptag=1005-10000
        var datas: List<Data>,
        var date: String, // 20160508
        var platformId: Int // 1 平台
)