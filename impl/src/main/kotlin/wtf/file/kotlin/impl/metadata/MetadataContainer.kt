package wtf.file.kotlin.impl.metadata

import wtf.file.api.metadata.MetadataContainer
import wtf.file.kotlin.metadata.MetadataContainer as IMetadataContainer

@JvmInline
value class MetadataContainer(private val by: MetadataContainer): IMetadataContainer {

    override fun contains(key: String) = by.has(key)

    override val keys: List<String>
        get() = by.keys()

    override fun get(key: String): String = by.get(key)

    override fun asMap(): Map<String, String> = by.asMap()

}
