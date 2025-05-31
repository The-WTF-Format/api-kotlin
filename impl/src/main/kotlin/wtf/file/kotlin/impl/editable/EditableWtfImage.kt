package wtf.file.kotlin.impl.editable

import wtf.file.api.editable.EditableWtfImage
import wtf.file.kotlin.color.ColorSpace
import wtf.file.kotlin.editable.compression.DataCompressionType
import wtf.file.kotlin.editable.data.EditablePixel
import wtf.file.kotlin.impl.editable.animation.EditableAnimationInformation
import wtf.file.kotlin.impl.editable.metadata.EditableMetadataContainer
import wtf.file.kotlin.mapping.toJava
import wtf.file.kotlin.mapping.toKotlin
import wtf.file.kotlin.version.Version
import java.awt.image.BufferedImage
import java.nio.file.Path
import wtf.file.kotlin.editable.EditableWtfImage as IEditableWtfImage

@JvmInline
value class EditableWtfImage(private val by: EditableWtfImage) : IEditableWtfImage {

    override val version: Version
        get() = by.version().toKotlin()

    override var width: Int
        get() = by.width()
        set(value) = by.setWidth(value)

    override var height: Int
        get() = by.height()
        set(value) = by.setHeight(value)

    override var colorSpace: ColorSpace
        get() = by.colorSpace().toKotlin()
        set(value) = by.setColorSpace(value.toJava())

    override var channelWidth: Int
        get() = by.channelWidth()
        set(value) = by.setChannelWidth(value)

    override val animationInformation
        get() = EditableAnimationInformation(by.animationInformation())

    override val metadataContainer
        get() = EditableMetadataContainer(by.metadataContainer())

    override fun save(
        path: Path,
        dataCompressionType: DataCompressionType
    ) {
        by.save(path, dataCompressionType.toJava())
    }

    override val pixels: Array<out Array<out EditablePixel>>
        get() = animationInformation[0].pixels

    override fun get(x: Int, y: Int) = animationInformation[0][x, y]

    override fun byJavaImage(image: BufferedImage) = animationInformation[0].byJavaImage(image)

    override fun asJavaImage() = animationInformation[0].asJavaImage()

}
