package com.lc.apkversionplugin

open  class ApkVersionExtension(var preName:String? = null,var apkVersion:String? = null)   {
    override fun toString(): String {
        return "$preName 和 $apkVersion"
    }
}