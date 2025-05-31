package wtf.file.kotlin.editable.animation

import wtf.file.kotlin.animation.AnimationInformation
import wtf.file.kotlin.editable.data.EditableFrame

/**
 * An interface extending [AnimationInformation] to provide editable functionality for animation data.
 *
 * This interface allows modifying animation properties such as the number of frames, frames per second, and
 * seconds per frame, along with fetching editable frames. It also ensures that any modifications to these properties
 * are validated and within the allowed range.
 */
interface EditableAnimationInformation : AnimationInformation {

    override var frames: Int

    override var framesPerSecond: Int

    override var secondsPerFrame: Int

    override fun get(index: Int): EditableFrame

}
