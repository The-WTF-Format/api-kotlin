package wtf.file.api.data

import wtf.file.api.exception.NumberOutOfBoundsException
import java.awt.Image

/**
 * Represents a single image frame consisting of a 2D array of [Pixel] values.
 *
 * A frame can be accessed programmatically by individual pixel coordinates or retrieved as
 * a full Java [Image] object for rendering or export.
 */
interface Frame {

    /**
     * The 2D array of pixels that make up the frame, index `[x][y]`
     */
    val pixels: Array<out Array<out Pixel>>

    /**
     * Returns the [Pixel] at the specified (x, y) coordinate.
     *
     * @param x the horizontal (column) position, starting from 0.
     * @param y the vertical (row) position, starting from 0.
     * @return the [Pixel] at the given coordinate.
     * @throws NumberOutOfBoundsException if the coordinates are outside the frame dimensions.
     */
    @Throws(NumberOutOfBoundsException::class)
    operator fun get(x: Int, y: Int): Pixel

    /**
     * Converts the frame into a standard Java [Image] object.
     * For this every pixel gets transformed into a [wtf.file.api.color.ColorSpace.RGB] pixel}, [wtf.file.api.color.ColorSpace.RGBa]
     * or [wtf.file.api.color.ColorSpace.DynamicRGBa] with a channel width of 8 bits (0-255 values).
     * Thus, information may get lost.
     *
     * @return the [Image] representation of this frame.
     */
    fun asJavaImage(): Image

}
