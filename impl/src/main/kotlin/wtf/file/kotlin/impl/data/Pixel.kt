package wtf.file.kotlin.impl.data

import wtf.file.api.data.Pixel
import wtf.file.kotlin.color.ColorSpace
import wtf.file.kotlin.color.channel.ColorChannel
import wtf.file.kotlin.mapping.toJava
import wtf.file.kotlin.mapping.toKotlin
import wtf.file.kotlin.data.Pixel as IPixel

@JvmInline
value class Pixel(private val by: Pixel) : IPixel {

    override val colorSpace: ColorSpace
        get() = by.colorSpace().toKotlin()

    override val values: Map<ColorChannel, Int>
        get() = by.values()
            .map { it.key.toKotlin() to it.value.toInt() }
            .toMap()

    override fun get(channel: ColorChannel) = by.valueOf(channel.toJava()).toInt()

    override fun withColorSpace(colorSpace: ColorSpace): IPixel = Pixel(by.withColorSpace(colorSpace.toJava()))

    override fun withWidth(channelWidth: Int): IPixel = Pixel(by.withWidth(channelWidth))


}
