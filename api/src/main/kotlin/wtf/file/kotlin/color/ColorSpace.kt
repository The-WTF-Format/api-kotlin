package wtf.file.kotlin.color

import wtf.file.kotlin.color.ColorSpaceChannels.blue
import wtf.file.kotlin.color.ColorSpaceChannels.blueChroma
import wtf.file.kotlin.color.ColorSpaceChannels.cyan
import wtf.file.kotlin.color.ColorSpaceChannels.dynamicAlpha
import wtf.file.kotlin.color.ColorSpaceChannels.fixedAlpha
import wtf.file.kotlin.color.ColorSpaceChannels.gray
import wtf.file.kotlin.color.ColorSpaceChannels.green
import wtf.file.kotlin.color.ColorSpaceChannels.hue
import wtf.file.kotlin.color.ColorSpaceChannels.luma
import wtf.file.kotlin.color.ColorSpaceChannels.magenta
import wtf.file.kotlin.color.ColorSpaceChannels.red
import wtf.file.kotlin.color.ColorSpaceChannels.redChroma
import wtf.file.kotlin.color.ColorSpaceChannels.saturation
import wtf.file.kotlin.color.ColorSpaceChannels.value
import wtf.file.kotlin.color.ColorSpaceChannels.yellow
import wtf.file.kotlin.color.channel.ColorChannel

/**
 * Represents predefined color spaces, each defined by a specific set of [ColorChannel]s.
 *
 * This enum supports common color models such as Grayscale, RGB, CMY, HSV, and YCbCr,
 * with optional alpha channels (both fixed and dynamic).
 *
 * Each color space can provide its list of channels and a default color map,
 * which currently defaults all channel values to zero (e.g., black or fully transparent).
 */
enum class ColorSpace(private vararg val _channels: ColorChannel) {

    GrayScale(gray),
    GrayScaleA(gray, fixedAlpha),
    DynamicGrayScaleA(gray, dynamicAlpha),
    RGB(red, green, blue),
    RGBa(red, green, blue, fixedAlpha),
    DynamicRGBa(red, green, blue, dynamicAlpha),
    CMY(cyan, magenta, yellow),
    CMYa(cyan, magenta, yellow, fixedAlpha),
    DynamicCMYa(cyan, magenta, yellow, dynamicAlpha),
    HSV(hue, saturation, value),
    HSVa(hue, saturation, value, fixedAlpha),
    DynamicHSVa(hue, saturation, value, dynamicAlpha),
    YCbCr(luma, blueChroma, redChroma),
    YCbCrA(luma, blueChroma, redChroma, fixedAlpha),
    DynamicYCbCrA(luma, blueChroma, redChroma, dynamicAlpha);

    /**
     * The list of color channels that define this color space.
     */
    val channels by lazy { _channels.toList() }

}
