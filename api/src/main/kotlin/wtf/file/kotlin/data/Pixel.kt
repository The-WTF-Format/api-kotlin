package wtf.file.kotlin.data

import wtf.file.kotlin.color.ColorSpace
import wtf.file.kotlin.color.channel.ColorChannel
import wtf.file.kotlin.exception.NumberOutOfBoundsException

/**
 * Represents a single pixel in an image, defined by a [ColorSpace] and a mapping of
 * [ColorChannel] values.
 *
 * A pixel provides access to its channel values, can be queried for individual channels,
 * and can be converted to another [ColorSpace] representation.
 */
interface Pixel {

    /**
     * The [ColorSpace] that defines the color composition of this pixel.
     */
    val colorSpace: ColorSpace

    /**
     * The mapping of [ColorChannel] to their corresponding numeric values for this pixel.
     */
    val values: Map<ColorChannel, Int>

    /**
     * Retrieves the numeric value associated with a specific color channel.
     *
     * @param channel the [ColorChannel] to query.
     * @return the value of the specified channel.
     * @throws IllegalArgumentException if the channel is not part of this pixel's [ColorSpace].
     */
    operator fun get(channel: ColorChannel): Int

    /**
     * Converts this pixel to the given [ColorSpace], potentially performing
     * a transformation or mapping between channel sets.
     *
     * @param colorSpace the target [ColorSpace].
     * @return a new `Pixel` in the specified color space, or null if it could not be converted.
     */
    fun withColorSpace(colorSpace: ColorSpace): Pixel

    /**
     * Creates a new `Pixel` instance with the specified channel width.
     *
     * @param channelWidth the width of each channel, typically in bits (e.g., 8 for 0-255 values).
     *   Must be a positive, non-zero integer smaller than or equal to 16
     * @return a new `Pixel` instance with the given channel width set.
     * @throws NumberOutOfBoundsException if the channel width is invalid.
     */
    @Throws(NumberOutOfBoundsException::class)
    fun withWidth(channelWidth: Int): Pixel

}
