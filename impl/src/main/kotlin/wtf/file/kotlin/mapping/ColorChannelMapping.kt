package wtf.file.kotlin.mapping

import wtf.file.kotlin.color.ColorSpaceChannels as KotlinColorSpaceChannels
import wtf.file.api.color.ColorSpaceChannels as JavaColorSpaceChannels
import wtf.file.api.color.channel.ColorChannel as JavaColorChannel
import wtf.file.kotlin.color.channel.ColorChannel as KotlinColorChannel

fun KotlinColorChannel.toJava(): JavaColorChannel = when(this) {
    KotlinColorSpaceChannels.dynamicAlpha -> JavaColorSpaceChannels.DYNAMIC_ALPHA
    KotlinColorSpaceChannels.fixedAlpha -> JavaColorSpaceChannels.FIXED_ALPHA
    KotlinColorSpaceChannels.gray -> JavaColorSpaceChannels.GRAY
    KotlinColorSpaceChannels.red -> JavaColorSpaceChannels.RED
    KotlinColorSpaceChannels.green -> JavaColorSpaceChannels.GREEN
    KotlinColorSpaceChannels.blue -> JavaColorSpaceChannels.BLUE
    KotlinColorSpaceChannels.cyan -> JavaColorSpaceChannels.CYAN
    KotlinColorSpaceChannels.magenta -> JavaColorSpaceChannels.MAGENTA
    KotlinColorSpaceChannels.yellow -> JavaColorSpaceChannels.YELLOW
    KotlinColorSpaceChannels.hue -> JavaColorSpaceChannels.HUE
    KotlinColorSpaceChannels.saturation -> JavaColorSpaceChannels.SATURATION
    KotlinColorSpaceChannels.value -> JavaColorSpaceChannels.VALUE
    KotlinColorSpaceChannels.luma -> JavaColorSpaceChannels.LUMA
    KotlinColorSpaceChannels.blueChroma -> JavaColorSpaceChannels.CHROMA_BLUE
    KotlinColorSpaceChannels.redChroma -> JavaColorSpaceChannels.CHROMA_RED
    else -> throw IllegalStateException("Unknown channel: $this")
}

fun JavaColorChannel.toKotlin() = when(this) {
    JavaColorSpaceChannels.DYNAMIC_ALPHA -> KotlinColorSpaceChannels.dynamicAlpha
    JavaColorSpaceChannels.FIXED_ALPHA -> KotlinColorSpaceChannels.fixedAlpha
    JavaColorSpaceChannels.GRAY -> KotlinColorSpaceChannels.gray
    JavaColorSpaceChannels.RED -> KotlinColorSpaceChannels.red
    JavaColorSpaceChannels.GREEN -> KotlinColorSpaceChannels.green
    JavaColorSpaceChannels.BLUE -> KotlinColorSpaceChannels.blue
    JavaColorSpaceChannels.CYAN -> KotlinColorSpaceChannels.cyan
    JavaColorSpaceChannels.MAGENTA -> KotlinColorSpaceChannels.magenta
    JavaColorSpaceChannels.YELLOW -> KotlinColorSpaceChannels.yellow
    JavaColorSpaceChannels.HUE -> KotlinColorSpaceChannels.hue
    JavaColorSpaceChannels.SATURATION -> KotlinColorSpaceChannels.saturation
    JavaColorSpaceChannels.VALUE -> KotlinColorSpaceChannels.value
    JavaColorSpaceChannels.LUMA -> KotlinColorSpaceChannels.luma
    JavaColorSpaceChannels.CHROMA_BLUE -> KotlinColorSpaceChannels.blueChroma
    JavaColorSpaceChannels.CHROMA_RED -> KotlinColorSpaceChannels.redChroma
    else -> throw IllegalStateException("Unknown channel: $this")
}
