package wtf.file.api.color

import wtf.file.api.color.channel.DynamicColorChannel
import wtf.file.api.color.channel.FixedColorChannel


/**
 * Provides a collection of predefined color channels used across various color spaces.
 *
 * Each color channel represents a specific component of a color within a given color space,
 * such as the red, green, or blue components in the RGB color space, or the luma and chroma components in the YCbCr color space.
 * These channels are represented as instances of [FixedColorChannel] or [DynamicColorChannel],
 * depending on whether their definition is static or dynamic.
 *
 * This class includes the following color channels:
 *
 * 1. Alpha Channels:
 *     * `FIXED_ALPHA`: A fixed channel representing transparency, defined with a constant bit depth.
 *     * `DYNAMIC_ALPHA`: A dynamic channel representing transparency, whose properties may depend on image headers.
 *
 *  2. Grayscale Channels:
 *     * `GRAY`: A dynamic channel representing grayscale intensity.
 *
 * 3. RGB (Red, Green, Blue) Channels:
 *     * `RED`: A dynamic channel representing the red component.
 *     * `GREEN`: A dynamic channel representing the green component.
 *     * `BLUE`: A dynamic channel representing the blue component.
 *
 * 4. CMY (Cyan, Magenta, Yellow) Channels:
 *     * `CYAN`: A dynamic channel representing the cyan component.
 *     * `MAGENTA`: A dynamic channel representing the magenta component.
 *     * `YELLOW`: A dynamic channel representing the yellow component.
 *
 * 5. HSV (Hue, Saturation, Value) Channels:
 *     * `HUE`: A dynamic channel representing the hue component.
 *     * `SATURATION`: A dynamic channel representing the saturation component.
 *     * `VALUE`: A dynamic channel representing the value (brightness) component.
 *
 * 6. YCbCr (Luma, Chroma) Channels:
 *     * `LUMA`: A dynamic channel representing the luminance.
 *     * `CHROMA_BLUE`: A dynamic channel representing the blue-difference chrominance.
 *     * `CHROMA_RED`: A dynamic channel representing the red-difference chrominance.
 */
object ColorSpaceChannels {

    // Alpha
    val fixedAlpha = FixedColorChannel("alpha", 1)
    val dynamicAlpha = DynamicColorChannel("alpha")

    // Gray
    val gray = DynamicColorChannel("gray")

    // RGB color space
    val red = DynamicColorChannel("red")
    val green = DynamicColorChannel("green")
    val blue = DynamicColorChannel("blue")

    // CMY color space
    val cyan = DynamicColorChannel("cyan")
    val magenta = DynamicColorChannel("magenta")
    val yellow = DynamicColorChannel("yellow")

    // HSV color space
    val hue = DynamicColorChannel("hue")
    val saturation = DynamicColorChannel("saturation")
    val value = DynamicColorChannel("value")

    // YCbCr color space
    val luma = DynamicColorChannel("luma")
    val blueChroma = DynamicColorChannel("chroma blue")
    val redChroma = DynamicColorChannel("chroma red")
}
