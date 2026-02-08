fun validatePassword(password: String): Boolean {

    fun hasMinLength() = password.length >= 8
    fun hasDigit() = password.any { it.isDigit() }
    fun hasUpperCase() = password.any { it.isUpperCase() }

    return hasMinLength() && hasDigit() && hasUpperCase()
}

fun main() {
    println(validatePassword("Password1")) // true
    println(validatePassword("pass"))      // false
}
