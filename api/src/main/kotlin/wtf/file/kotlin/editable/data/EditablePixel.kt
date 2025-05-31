package wtf.file.kotlin.editable.data

import wtf.file.kotlin.color.channel.ColorChannel
import wtf.file.kotlin.data.Pixel
import wtf.file.kotlin.exception.NumberOutOfBoundsException

/**
 * An interface extending [Pixel] to provide editable functionality for individual pixels.
 *
 * This interface allows modification of pixel values for different color channels and ensures that
 * values set for pixels are within the allowed range.
 */
interface EditablePixel : Pixel {


    /**
     * Sets the values for all color channels in this pixel.
     *
     * This method allows you to update the pixel with a map of channel values, where the key is
     * the [ColorChannel] and the value is the corresponding pixel value.
     *
     * @param values a map of color channels with their corresponding pixel values.
     * @throws NumberOutOfBoundsException if any of the values exceed the allowed range for that channel.
     * @throws IllegalArgumentException if the map does not contain the exact channels required by the color space
     */
    @Throws(NumberOutOfBoundsException::class)
    fun setValues(values: Map<ColorChannel, Int>)

    /**
     * Sets the value for a specific color channel in this pixel.
     *
     * @param channel the [ColorChannel] to update.
     * @param value   the new value to set for the specified channel.
     * @throws NumberOutOfBoundsException if the value is out of the allowed range for the specified channel.
     * @throws IllegalArgumentException if the channel is not part of the color space
     */
    @Throws(NumberOutOfBoundsException::class)
    operator fun set(channel: ColorChannel, value: Int)


}
