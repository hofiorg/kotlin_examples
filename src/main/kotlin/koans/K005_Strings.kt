// https://play.kotlinlang.org/koans/Introduction/Strings/Task.kt

package koans

const val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern() = """\d{2}\ $month \d{4}"""