package wtf.file.api.editable.metadata

import wtf.file.api.exception.IllegalCharacterException
import wtf.file.api.metadata.MetadataContainer

/**
 * Represents a container for editable metadata.
 *
 * This interface extends the [MetadataContainer] and provides additional methods for modifying the metadata,
 * including setting and removing metadata entries.
 */
interface EditableMetadataContainer : MetadataContainer {

    /**
     * Removes the metadata entry associated with the specified key from the container.
     * If the `key` is not in the container, this method does nothing.
     *
     * @param key the key of the metadata entry to be removed
     */
    fun remove(key: String)

    /**
     * @see remove
     */
    operator fun minusAssign(key: String) = remove(key)

    /**
     * Sets the value of a metadata entry associated with the specified key.
     * If a metadata entry with the specified key already exists, its value is updated.
     * If the specified key or value contains illegal characters, an exception is thrown.
     *
     * @param key the key of the metadata entry to be set, only ASCII characters, excluding the NUL characters, are allowed.
     * @param value the value to be associated with the specified key, any UTF-8 encodable characters, excluding the NUL characters, are allowed.
     * @throws IllegalCharacterException if the key or value contains one or more illegal characters
     */
    @Throws(IllegalCharacterException::class)
    operator fun set(key: String, value: String)

}
