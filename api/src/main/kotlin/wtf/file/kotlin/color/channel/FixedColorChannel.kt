package wtf.file.kotlin.color.channel

/**
 * A [FixedColorChannel] implementation representing a fixed color channel.
 * A fixed color channel has a name and a fixed bit-depth value, which cannot change during runtime.
 * This type of channel corresponds to [ChannelType.Fixed].
 */
@ConsistentCopyVisibility
data class FixedColorChannel internal constructor(override val name: String, val bits: Int) : ColorChannel {

    override val type: ChannelType = ChannelType.Fixed

}
