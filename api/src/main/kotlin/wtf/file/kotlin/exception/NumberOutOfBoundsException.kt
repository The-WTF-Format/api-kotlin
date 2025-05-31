package wtf.file.kotlin.exception

/**
 * Thrown to indicate that a numeric value is outside the expected bounds.
 *
 * This exception provides access to the minimum, maximum, and actual values
 * involved in the failed validation.
 */
class NumberOutOfBoundsException(min: Long, max: Long, value: Long, name: String?) :
    RuntimeException("Value $value for $name is out of bounds: [$min, $max]")
