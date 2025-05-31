package wtf.file.kotlin.impl.editable.animation

import wtf.file.api.editable.animation.EditableAnimationInformation
import wtf.file.kotlin.editable.data.EditableFrame
import wtf.file.kotlin.editable.animation.EditableAnimationInformation as IEditableAnimationInformation

@JvmInline
value class EditableAnimationInformation(private val by: EditableAnimationInformation) : IEditableAnimationInformation {

    override var frames: Int
        get() = by.frames()
        set(value) = by.setFrames(value)

    override var framesPerSecond: Int
        get() = by.framesPerSecond()
        set(value) = by.setFramesPerSecond(value)

    override var secondsPerFrame: Int
        get() = by.secondsPerFrame()
        set(value) = by.setSecondsPerFrame(value)

    override fun get(index: Int): EditableFrame {
        TODO("Not yet implemented")
    }

    override val isFpsCoded: Boolean
        get() = TODO("Not yet implemented")

}
