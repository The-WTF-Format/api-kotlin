package wtf.file.api.editable.data

import wtf.file.api.data.Frame
import java.awt.image.BufferedImage

/**
 * An interface extending [Frame] to provide editable functionality for individual image frames.
 *
 * This interface allows modification of pixel data and enables setting the frame content from a [BufferedImage].
 */
interface EditableFrame : Frame {

    override val pixels: Array<Array<EditablePixel>>

    override fun get(x: Int, y: Int): EditablePixel

    /**
     * Sets the content of this frame using a standard Java [BufferedImage].
     *
     * This method allows the frame to be populated with an [BufferedImage], which could be used
     * to import image data or manipulate the frame based on external image sources.
     *
     * @param image the [BufferedImage] to set as the content of this frame.
     */
    fun byJavaImage(image: BufferedImage)

}
