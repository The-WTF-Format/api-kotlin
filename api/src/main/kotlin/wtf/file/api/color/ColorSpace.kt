package wtf.file.api.color

import wtf.file.api.color.channel.ColorChannel
import wtf.file.api.color.value.DefaultValue

import wtf.file.api.color.ColorSpaceChannels.fixedAlpha
import wtf.file.api.color.ColorSpaceChannels.dynamicAlpha
import wtf.file.api.color.ColorSpaceChannels.gray
import wtf.file.api.color.ColorSpaceChannels.red
import wtf.file.api.color.ColorSpaceChannels.green
import wtf.file.api.color.ColorSpaceChannels.blue
import wtf.file.api.color.ColorSpaceChannels.cyan
import wtf.file.api.color.ColorSpaceChannels.magenta
import wtf.file.api.color.ColorSpaceChannels.yellow
import wtf.file.api.color.ColorSpaceChannels.hue
import wtf.file.api.color.ColorSpaceChannels.saturation
import wtf.file.api.color.ColorSpaceChannels.value
import wtf.file.api.color.ColorSpaceChannels.luma
import wtf.file.api.color.ColorSpaceChannels.blueChroma
import wtf.file.api.color.ColorSpaceChannels.redChroma

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

    /**
     * The default color value map for this color space.
     *
     * By default, all channels are assigned a value of `0` via [DefaultValue.ZERO].
     * This represents black or fully transparent values, depending on the channel.
     */
    val defaultColor by lazy { channels.associateWith { DefaultValue.ZERO } }
}
