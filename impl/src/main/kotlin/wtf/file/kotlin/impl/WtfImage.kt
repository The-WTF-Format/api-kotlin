package wtf.file.kotlin.impl

import wtf.file.api.WtfImage
import wtf.file.kotlin.animation.AnimationInformation
import wtf.file.kotlin.color.ColorSpace
import wtf.file.kotlin.data.Pixel
import wtf.file.kotlin.editable.EditableWtfImage
import wtf.file.kotlin.mapping.toKotlin
import wtf.file.kotlin.metadata.MetadataContainer
import wtf.file.kotlin.version.Version
import wtf.file.kotlin.WtfImage as IWtfImage

@JvmInline
value class WtfImage(private val by: WtfImage) : IWtfImage {

    override val version: Version
        get() = by.version().toKotlin()

    override val width: Int
        get() = by.width()

    override val height: Int
        get() = by.height()

    override val colorSpace: ColorSpace
        get() = by.colorSpace().toKotlin()

    override val channelWidth: Int
        get() = by.channelWidth()

    override val animationInformation: AnimationInformation
        get() = wtf.file.kotlin.impl.animation.AnimationInformation(by.animationInformation())

    override val metadataContainer: MetadataContainer
        get() = wtf.file.kotlin.impl.metadata.MetadataContainer(by.metadataContainer())

    override fun edit(): EditableWtfImage {
        TODO("Not yet implemented")
    }

    override val pixels: Array<out Array<out Pixel>>
        get() = animationInformation[0].pixels

    override fun get(x: Int, y: Int) = animationInformation[0][x, y]

    override fun asJavaImage() = animationInformation[0].asJavaImage()


}
