package wtf.file.kotlin.impl.editable.data

import wtf.file.api.editable.data.EditableFrame
import java.awt.Image
import java.awt.image.BufferedImage
import wtf.file.kotlin.editable.data.EditableFrame as IEditableFrame
import wtf.file.kotlin.editable.data.EditablePixel as IEditablePixel

@JvmInline
value class EditableFrame(private val by: EditableFrame) : IEditableFrame {

    override val pixels: Array<out Array<out IEditablePixel>>
        get() = by.pixels().map { col -> col.map { EditablePixel(it) }.toTypedArray() }.toTypedArray()

    override fun get(x: Int, y: Int) = EditablePixel(by.at(x, y))

    override fun asJavaImage(): Image = by.asJavaImage()

    override fun byJavaImage(image: BufferedImage) {
        by.byJavaImage(image)
    }


}
