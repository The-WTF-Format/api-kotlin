package wtf.file.kotlin

import wtf.file.api.WtfLoader
import wtf.file.kotlin.dsl.WtfDsl
import wtf.file.kotlin.exception.WtfException
import wtf.file.kotlin.mapping.toJava
import java.io.IOException
import java.nio.file.Path


/**
 * Creates a WtfImage instance by loading it from the specified path.
 *
 * @param path the path to load the WtfImage from
 * @return the loaded WtfImage instance
 * @throws WtfException if there is an issue specific to WtfImage loading.
 * e.g., an unknown version or too few or many bytes
 * @throws IOException if an I/O error occurs during the loading process
 * @see WtfImage
 */
@Throws(WtfException::class, IOException::class)
fun wtf(path: Path): WtfImage {
    return try {
        wtf.file.kotlin.impl.WtfImage(WtfLoader.from(path))
    } catch (e: wtf.file.api.exception.WtfException) {
        throw WtfException("Could not decode image", e)
    }
}

fun wtf(block: WtfDsl.() -> Unit): WtfImage {
    val values = WtfDsl().apply(block)
    return wtf.file.kotlin.impl.WtfImage(
        WtfLoader.by()
            .version(values.version.toJava())
            .width(values.width)
            .height(values.height)
            .colorSpace(values.colorSpace.toJava())
            .channelWidth(values.channelWidth)
            .frames(values.frames)
            .apply {
                if (values.framesPerSecond != null) framesPerSecond(values.framesPerSecond!!)
                if (values.secondsPerFrame != null) framesPerSecond(values.secondsPerFrame!!)
            }
            .build()
    )

}
