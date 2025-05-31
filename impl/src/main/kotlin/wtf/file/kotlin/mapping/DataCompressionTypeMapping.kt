package wtf.file.kotlin.mapping

import wtf.file.api.editable.compression.DataCompressionType as JavaDataCompressionType
import wtf.file.kotlin.editable.compression.DataCompressionType as KotlinDataCompressionType

fun KotlinDataCompressionType.toJava() = when(this) {
    KotlinDataCompressionType.NoCompression -> JavaDataCompressionType.NO_COMPRESSION
    KotlinDataCompressionType.InlineCompression -> JavaDataCompressionType.INLINE_COMPRESSION
    KotlinDataCompressionType.MappedCompression -> JavaDataCompressionType.MAPPED_COMPRESSION
    KotlinDataCompressionType.CombinedCompression -> JavaDataCompressionType.COMBINED_COMPRESSION
}

fun JavaDataCompressionType.toKotlin() = when(this) {
    JavaDataCompressionType.NO_COMPRESSION -> KotlinDataCompressionType.NoCompression
    JavaDataCompressionType.INLINE_COMPRESSION -> KotlinDataCompressionType.InlineCompression
    JavaDataCompressionType.MAPPED_COMPRESSION -> KotlinDataCompressionType.MappedCompression
    JavaDataCompressionType.COMBINED_COMPRESSION -> KotlinDataCompressionType.CombinedCompression
}
