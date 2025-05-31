package wtf.file.kotlin.editable.compression

/**
 * Enum representing the types of data compression available for use in image saving operations.
 * Each compression type determines whether specific compression techniques,
 * such as CLUT coding or Reference-based compression, are used.
 *
 * The compression type can be used to optimize data storage and performance during
 * save operations and other data processing tasks.
 */
enum class DataCompressionType(val clut: Boolean, val reference: Boolean) {

    /**
     * Represents a data compression type where no compression is applied.
     * Both CLUT-based and reference-based compression techniques are disabled.
     * This type is suitable when compression is not required or when raw data storage is preferred.
     */
    NoCompression(false, false),

    /**
     * Represents the compression type, where only reference-based compression techniques are applied.
     */
    InlineCompression(false, true),

    /**
     * Represents the compression type, where only CLUT-based compression techniques are applied.
     */
    MappedCompression(true, false),

    /**
     * Represents the compression type, where both CLUT-based and reference-based compression techniques are applied.
     */
    CombinedCompression(true, true);

}
