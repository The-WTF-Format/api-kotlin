package wtf.file.kotlin.impl.editable.data

import wtf.file.api.editable.data.EditablePixel
import wtf.file.kotlin.color.ColorSpace
import wtf.file.kotlin.color.channel.ColorChannel
import wtf.file.kotlin.impl.data.Pixel
import wtf.file.kotlin.mapping.toJava
import wtf.file.kotlin.mapping.toKotlin
import wtf.file.kotlin.editable.data.EditablePixel as IEditablePixel

@JvmInline
value class EditablePixel(private val by: EditablePixel) : IEditablePixel {

    override val colorSpace: ColorSpace
        get() = by.colorSpace().toKotlin()

    override val values: Map<ColorChannel, Int>
        get() = by.values()
            .map { it.key.toKotlin() to it.value.toInt() }
            .toMap()

    override fun get(channel: ColorChannel) = by.valueOf(channel.toJava()).toInt()

    override fun withColorSpace(colorSpace: ColorSpace) = Pixel(by.withColorSpace(colorSpace.toJava()))

    override fun withWidth(channelWidth: Int) = Pixel(by.withWidth(channelWidth))

    override fun setValues(values: Map<ColorChannel, Int>) {
        by.setValues(
            values
                .map { it.key.toJava() to it.value.toShort() }
                .toMap()
        )
    }

    override fun set(channel: ColorChannel, value: Int) {
        by.setValue(channel.toJava(), value.toShort())
    }

}
