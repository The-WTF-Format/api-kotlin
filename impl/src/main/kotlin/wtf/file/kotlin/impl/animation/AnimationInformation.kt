package wtf.file.kotlin.impl.animation

import wtf.file.api.animation.AnimationInformation
import wtf.file.kotlin.impl.data.Frame
import wtf.file.kotlin.animation.AnimationInformation as IAnimationInformation

@JvmInline
value class AnimationInformation(private val by: AnimationInformation) : IAnimationInformation {

    override val frames: Int
        get() = by.frames()

    override val isFpsCoded: Boolean
        get() = by.isFpsCoded

    override val framesPerSecond: Int
        get() = by.framesPerSecond()

    override val secondsPerFrame: Int
        get() = by.secondsPerFrame()

    override fun get(index: Int) = Frame(by.frame(index))


}
