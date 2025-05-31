package wtf.file.api.color.channel

/**
 * A [ColorChannel] implementation representing a dynamic color channel.
 * A dynamic color channel has a name and is characterized by the dependency on the header information from the image.
 * This type of channel corresponds to [ChannelType.Dynamic]
 */
@ConsistentCopyVisibility
data class DynamicColorChannel internal constructor(override val name: String) : ColorChannel {

    override val type: ChannelType = ChannelType.Dynamic

}
