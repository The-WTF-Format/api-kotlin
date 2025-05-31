package wtf.file.kotlin.impl.data

import wtf.file.api.data.Frame
import wtf.file.kotlin.data.Pixel
import java.awt.Image
import wtf.file.kotlin.data.Frame as IFrame

@JvmInline
value class Frame(private val by: Frame) : IFrame {

    override val pixels: Array<out Array<out Pixel>>
        get() = by.pixels().map { col -> col.map { Pixel(it) }.toTypedArray() }.toTypedArray()

    override fun get(x: Int, y: Int) = Pixel(by.at(x, y))

    override fun asJavaImage(): Image = by.asJavaImage()

}
