package com.example.praktikum1

fun ConditionalStatement() {
    println("=== Conditional Expression ===")

    val number = 10
    if (number > 0) {
        println("Positive number")
    } else {
        println("Negative number")
    }

    val day = 1
    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid day")

    }

    val value = "10"
    try {
        val result = value.toInt()
        println("Result: $result")
    }catch (
        e: NumberFormatException
    ) {
        println("Invalid number format")
    }
}

fun Perulangan() {
    println("=== Perulangan ===")

    for (i in 1..5) {
        println("Perulangan ke-$i")
    }

    val cars = listOf("BMW", "Toyota", "Honda", "Audi")
    for (car in cars) {
        println("Car type: $car")
    }


}