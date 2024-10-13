package com.example.praktikum1

fun upperCaseString(string: String): String {
    return string.uppercase()
}

fun main() {
    upperCaseString("hello")
    println({string: String -> string.uppercase()}("hello"))
}