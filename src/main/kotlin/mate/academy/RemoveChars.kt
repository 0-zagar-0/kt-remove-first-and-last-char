package mate.academy

const val REMOVAL_QUANTITY = 1

fun removeChars(str: String): String {
    // Implement this function
    return str.drop(REMOVAL_QUANTITY).dropLast(REMOVAL_QUANTITY)
}
