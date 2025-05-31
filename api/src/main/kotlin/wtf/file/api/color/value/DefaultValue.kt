package wtf.file.api.color.value

/**
 * Represents a default value provider for a color channel based on its bit width.
 *
 * Enum values define how to compute a default value given the width (in bits) of a color channel.
 */
enum class DefaultValue(private val get: (Int) -> Int) {

    /**
     * Always returns the maximum possible value for a given color channel width.
     *
     * The maximum value is computed as `(2^channelWidth) - 1`, which is the
     * highest number representable by the specified number of bits.
     */
    MAX({ (1 shl it) - 1 }),


    /**
     * Always returns zero, regardless of the channel width.
     *
     * This can be used when a default value of zero is appropriate for a color channel,
     * such as representing full transparency or no intensity.
     */
    ZERO({ 0 });

    /**
     * Get the default value corresponding to the given channel width (in bits).
     *
     * @param channelWidth the bit width of the color channel
     * @return the default value
     */
    fun forChannelWidth(channelWidth: Int): Int = get(channelWidth)

}
