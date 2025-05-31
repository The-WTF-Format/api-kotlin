package wtf.file.kotlin.mapping

import wtf.file.api.version.Version as JavaVersion
import wtf.file.kotlin.version.Version as KotlinVersion

fun KotlinVersion.toJava() = when(this) {
    KotlinVersion.Version1 -> JavaVersion.VERSION_1
}

fun JavaVersion.toKotlin() = when(this) {
    JavaVersion.VERSION_1 -> KotlinVersion.Version1
}
