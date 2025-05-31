package wtf.file.api.editable

import wtf.file.api.WtfImage
import wtf.file.api.color.ColorSpace
import wtf.file.api.editable.animation.EditableAnimationInformation
import wtf.file.api.editable.compression.DataCompressionType
import wtf.file.api.editable.data.EditableFrame
import wtf.file.api.editable.metadata.EditableMetadataContainer
import wtf.file.api.exception.WtfException
import java.io.IOException
import java.nio.file.Path

/**
 * Represents an editable version of a WtfImage.
 * This interface combines the functionalities of [WtfImage] and [EditableFrame],
 * enabling modifications to the width, height, color space, channel width, animation information, and metadata of the image.
 * Changes can be saved to a file with various compression options.
 * <p>
 * Methods in this interface allow for direct changes to the properties of the image.
 * The modifications include altering dimensions, color channels, metadata,
 * and animation properties, along with saving the image in different formats and compression levels.
 *
 * @see WtfImage
 * @see EditableFrame
 */
interface EditableWtfImage : WtfImage, EditableFrame {

    override var width: Int
    override var height: Int
    override var colorSpace: ColorSpace
    override var channelWidth: Int

    override val animationInformation: EditableAnimationInformation
    override val metadataContainer: EditableMetadataContainer

    override fun edit() = this

    /**
     * Saves the current editable image to the specified file path using the provided compression settings.
     *
     * @param path the file path where the image will be saved; must not be null
     * @param dataCompressionType the type of compression applied to the image data; must not be null
     *
     * @throws IOException if an I/O error occurs during the save operation
     * @throws WtfException if an error occurs encoding the image data
     */
    @Throws(IOException::class, WtfException::class)
    fun save(path: Path, dataCompressionType: DataCompressionType)

    /**
     * Saves the current editable image to the specified file path using default compression settings.
     * The default settings use mapped compression for the data.
     *
     * @param path the file path where the image will be saved; must not be null
     * @throws IOException if an I/O error occurs during the save operation
     * @throws WtfException if an error occurs encoding the image data
     */
    @Throws(IOException::class, WtfException::class)
    fun save(path: Path) = save(path, DataCompressionType.MappedCompression)

}
