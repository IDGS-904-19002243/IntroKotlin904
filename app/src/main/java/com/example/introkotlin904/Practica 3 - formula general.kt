package com.example.introkotlin904

fun main() {
    var a: Double
    var b: Double
    var c: Double

    println("Ingrese el valor de A (debe ser diferente de 0):")
    a = readln().toDouble()

    while (a == 0.0) {
        println("A no puede ser 0. Ingrese un valor diferente:")
        a = readln().toDouble()
    }

    println("Ingrese el valor de B:")
    b = readln().toDouble()

    println("Ingrese el valor de C:")
    c = readln().toDouble()

    val discriminante = calcularDiscriminante(a, b, c)

    mostrarResultado(a, b, discriminante)
}

fun calcularDiscriminante(a: Double, b: Double, c: Double): Double {
    return b * b - 4 * a * c
}

fun mostrarResultado(a: Double, b: Double, discriminante: Double) {
    if (discriminante > 0) {
        val x1 = (-b + Math.sqrt(discriminante)) / (2 * a)
        val x2 = (-b - Math.sqrt(discriminante)) / (2 * a)
        println("La ecuación tiene dos soluciones reales:")
        println("x1 = $x1")
        println("x2 = $x2")
    } else if (discriminante == 0.0) {
        val x = -b / (2 * a)
        println("La ecuación tiene una única solución real:")
        println("x = $x")
    } else {
        println("La ecuación no tiene soluciones reales.")
    }
}