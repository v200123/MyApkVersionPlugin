package com.lc.apkversionplugin

import com.android.build.api.dsl.ApkExtension
import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.variant.AndroidComponentsExtension
import com.android.build.api.variant.ApplicationAndroidComponentsExtension
import com.android.build.gradle.AppExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class MyApkVersionPlugin : Plugin<Project> {
    override fun apply(p0: Project) {
        p0.task("doRelease") {
            val create = p0.extensions.create("apkRename", ApkVersionExtension::class.java)
            println(create)
            val appExtension = p0.extensions.getByType(BaseAppModuleExtension::class.java)
            create.apkVersion = appExtension.defaultConfig.versionName
            p0.extensions.getByType(ApplicationAndroidComponentsExtension::class.java).finalizeDsl {
                it.defaultConfig.
            }
            println("打印下buildConfigFields")
            appExtension.defaultConfig.buildConfigFields.forEach { s, classField ->
                println("$s->${classField.value}")
            }
        }.apply {
            group = "MyVersion"
            dependsOn()
        }
    }
}