package com.hawksjamesf.network

import com.squareup.moshi.JsonClass

//@JsonClass(generateAdapter = true)
data class Data(
        var crashCount: Int, // 1430 crash次数
        var crashUser: Int, // 1423 crash影响用户数
        var tagId: Int? = -1, // 15120 tagId
        var tagName: String? = null, // testTag tag名称
        var type: Int=-1, // 2,tag类型,1为sdk上设置上报,2为页面手动设置
        var url: String, // http://bugly.qq.com/search?app=1104512706&pid=1&ptag=1017-10000&ver=all&bi=all&cl=all&ct=all&s=all&dt=all&tl=12972
        var version: String,//"1.2.3",//app版本号
        var accessUser: Int //12972, 联网用户数

)