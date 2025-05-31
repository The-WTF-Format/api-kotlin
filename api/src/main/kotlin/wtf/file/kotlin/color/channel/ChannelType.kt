package wtf.file.kotlin.color.channel

/**
 * Enum representing the different types of channels in the color system.
 *
 * [Dynamic] channels depend on the header information from the image, while [Fixed] channels have a constant value.
 */
enum class ChannelType {

    /**
     * Represents a channel that depends on the header information from the image.
     */
    Dynamic,

    /**
     * Represents a channel with a fixed value that does not change during runtime.
     */
    Fixed;

}
