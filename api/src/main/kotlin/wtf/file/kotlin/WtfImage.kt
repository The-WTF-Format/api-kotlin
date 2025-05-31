package wtf.file.kotlin

import wtf.file.kotlin.animation.AnimationInformation
import wtf.file.kotlin.color.ColorSpace
import wtf.file.kotlin.data.Frame
import wtf.file.kotlin.editable.EditableWtfImage
import wtf.file.kotlin.metadata.MetadataContainer
import wtf.file.kotlin.version.Version

/**
 * The WtfImage interface represents an image with defined properties and functions,
 * supporting various color spaces, metadata manipulation, and animation information.
 *
 * It extends the Frame interface, adding specific methods for retrieving
 * image configuration and metadata. Instances of WtfImage are immutable;
 * editing requires transitioning to an EditableWtfImage.
 *
 * The methods from `Frame` take actions on the first frame of the image.
 *
 * @see Frame
 * @see EditableWtfImage
 */
interface WtfImage : Frame {

    /**
     * The version of the WtfImage.
     */
    val version: Version

    /**
     * The width of the image.
     */
    val width: Int

    /**
     * The height of the image.
     */
    val height: Int

    /**
     * The color space configuration used by the image.
     * The color space determines how pixel information is represented (e.g., RGB, CMY, HSV, etc.) and may include
     * details like the number of channels and whether an alpha channel is fixed or dynamic.
     */
    val colorSpace: ColorSpace

    /**
     * The channel width of the image.
     * The channel width represents the bit depth per channel, specifying the amount of information stored per color channel.
     */
    val channelWidth: Int

    /**
     * Animation information associated with the image.
     * The animation information includes details such as the number of frames, frame rate (frames per second),
     * or seconds per frame, and whether the animation metadata is FPS-coded or SPF-coded.
     */
    val animationInformation: AnimationInformation

    /**
     * The metadata container associated with the image.
     * The metadata container provides functionalities to access and inspect metadata elements associated with the image.
     */
    val metadataContainer: MetadataContainer

    /**
     * Transitions the current immutable `WtfImage` instance into a modifiable `EditableWtfImage`.
     * This method allows for editing properties, metadata, and other attributes of the image.
     *
     * @return a new instance of `EditableWtfImage` representing an editable version of the current image
     */
    fun edit(): EditableWtfImage

}
