package wtf.file.kotlin.dsl

import wtf.file.kotlin.color.ColorSpace
import wtf.file.kotlin.version.Version
import kotlin.properties.Delegates

class WtfDsl {

    var version = Version.Version1
    var width by Delegates.notNull<Int>()
    var height by Delegates.notNull<Int>()
    lateinit var colorSpace: ColorSpace
    var channelWidth = 8
    var frames = 1
    var framesPerSecond: Int? = null
    var secondsPerFrame: Int? = null

}
