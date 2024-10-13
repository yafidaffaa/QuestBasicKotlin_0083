package com.example.praktikum1

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello World")
}

fun withParameter(name: String) {
    println("== withParameter ==")
    println("Hello $name")
}

fun withNamedParameter(Name: String, age: Int) {
    println("== withNamedParameter ==")
    println("Hello $Name, your $age years old")
}

fun withDefaultParameter(name: String = "Indra", age: Int) {
    println("== withDefaultParameter ==")
    println("Hello $name, your $age years old")
}

fun withReturn(panjang: Int, lebar: Int): Int {
    return panjang * lebar
}

fun main(){
    withoutParameter()
    withParameter("John")
    withNamedParameter(age = 30, Name = "John")
    withDefaultParameter(age = 25)
}
