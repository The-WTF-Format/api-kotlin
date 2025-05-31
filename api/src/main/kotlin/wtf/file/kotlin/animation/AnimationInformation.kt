package wtf.file.kotlin.animation

import wtf.file.kotlin.data.Frame
import wtf.file.kotlin.exception.NumberOutOfBoundsException

/**
 * Represents metadata and behavior for an animated object, including frame data
 * and timing information.
 */
interface AnimationInformation {

    /**
     * The total number of frames in the animation.
     */
    val frames: Int

    /**
     * Whether the object is animated, defined by having more than one frame.
     */
    val isAnimated: Boolean
        get() = frames > 1

    /**
     * Indicates whether the animation timing is defined using frames per second (FPS).
     */
    val isFpsCoded: Boolean

    /**
     * Indicates whether the animation timing is defined using seconds per frame (SPF).
     * This is the inverse of [isFpsCoded].
     */
    val isSpfCoded: Boolean
        get() = !this.isFpsCoded

    /**
     * The number of frames per second if timing is FPS-coded or `0` if the image is SPF-coded.
     */
    val framesPerSecond: Int

    /**
     * The number of seconds per frame if timing is SPF-coded or `0` if the image is FPS-coded.
     */
    val secondsPerFrame: Int

    /**
     * Retrieves a specific frame by index.
     *
     * @param index the zero-based index of the frame to retrieve
     * @return the [Frame] at the specified index
     * @throws NumberOutOfBoundsException if the index is out of range
     */
    @Throws(NumberOutOfBoundsException::class)
    operator fun get(index: Int): Frame

}
