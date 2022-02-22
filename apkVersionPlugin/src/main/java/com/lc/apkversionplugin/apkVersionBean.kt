package com.lc.apkversionplugin

import com.android.build.api.AndroidPluginVersion

data class apkVersionBean( var buildToolsVersion:String = "",var compileSdkVersion:Int =0
                           ,var buildType:String = "",var targetSdk:Int = 0,var flavorName:String? =""
) {

}