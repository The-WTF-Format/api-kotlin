package wtf.file.api.metadata

/**
 * Represents a container for metadata.
 * This container allows for the retrieval and inspection of metadata elements identified by keys.
 */
interface MetadataContainer {

    /**
     * Checks if the metadata container contains a value associated with the specified key.
     *
     * @param key the key to check for existence in the metadata container
     * @return true if a value associated with the specified key exists, false otherwise
     */
    operator fun contains(key: String): Boolean

    /**
     * A list of all keys present in the metadata container.
     */
    val keys: List<String>

    /**
     * Retrieves the value associated with the specified key in the metadata container.
     *
     * @param key the key for which the associated value is to be retrieved
     * @return the value associated with the specified key, or null if no value is present
     */
    operator fun get(key: String): String

    /**
     * Retrieves all metadata elements as a map where the keys represent metadata keys
     * and the values represent their corresponding metadata values.
     *
     * @return a map containing all metadata elements, with keys as metadata keys and values as metadata values
     */
    fun asMap(): Map<String, String>
}
