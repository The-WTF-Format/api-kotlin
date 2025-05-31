package wtf.file.kotlin.impl.editable.metadata

import wtf.file.api.editable.metadata.EditableMetadataContainer
import wtf.file.kotlin.editable.metadata.EditableMetadataContainer as IEditableMetadataContainer

@JvmInline
value class EditableMetadataContainer(private val by: EditableMetadataContainer) : IEditableMetadataContainer {

    override fun contains(key: String) = by.has(key)

    override val keys: List<String>
        get() = by.keys()

    override fun get(key: String): String = by.get(key)

    override fun asMap(): Map<String, String> = by.asMap()

    override fun remove(key: String) = by.remove(key)

    override fun set(key: String, value: String) = by.set(key, value)


}
