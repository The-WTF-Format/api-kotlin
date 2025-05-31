package wtf.file.kotlin.exception

/**
 * Thrown to indicate that an image contains broken or corrupt data.
 *
 * This exception is used specifically to signal issues encountered while processing
 * image files that are invalid, damaged, or otherwise unreadable due to corruption.
 */
class WtfException : Exception {

    constructor(message: String) : super(message)
    constructor(message: String, cause: Throwable) : super(message, cause)

}
