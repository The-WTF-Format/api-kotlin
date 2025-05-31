package wtf.file.api.exception

/**
 * Thrown to indicate that an illegal character was encountered during processing.
 *
 * This exception provides details about the offending character and the set of allowed characters.
 */
class IllegalCharacterException(character: Char, allowed: String?) :
    RuntimeException("Illegal character: $character. Allowed: $allowed")
