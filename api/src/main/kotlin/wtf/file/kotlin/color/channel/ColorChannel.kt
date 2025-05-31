package wtf.file.kotlin.color.channel

/**
 * Represents a color channel with a name and type.
 * A color channel is typically used to define specific components of a color, such as red, green, blue, or alpha channels.
 */
sealed interface ColorChannel {

    /**
     * The name of the color channel, representing its designation such as red, green, blue, or alpha.
     */
    val name: String

    /**
     * Represents the type of the color channel, which defines the stored bits for this channel.
     */
    val type: ChannelType

}
