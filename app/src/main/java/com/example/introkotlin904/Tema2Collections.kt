package com.example.introkotlin904

class Tema2Collections {

    /*
        List
        Map
        MutableSet
        MutableMap
    */

    /*
    val readOnlyFiguras = listOf("Cuadrado", "TRiangulo", "Circulo")
    println(readOnlyFiguras)


    var Figura: mutableFiguras = mutabeListOf("Cuadrado", "TRiangulo", "Circulo")
    val readOnlyFiguras = listOf("Cuadrado", "TRiangulo", "Circulo")
    val mutableFiguras = list<String> = mutableFiguras

    */

    /*
    val frutas = setOf("Manzana", "Banana", "Naranja")
    val frutas = mutableSetOf("Manzana", "Banana", "Naranja")

    val coches = mapOf("uno" to 1, "dos" to 2, "tres" to 3)
    println("coches")

    val coches2 = mutableMapOf("uno" to 1, "dos" to 2, "tres" to 3)
    println("coches2")
    */

    fun main() {
        val readOnlyFiguras = listOf("Cuadrado", "Triangulo", "Circulo")
        println(readOnlyFiguras)

        println("La primera figura es: ${readOnlyFiguras[0]}")
        println("El primer elemento es: ${readOnlyFiguras.first()}")
        print("La cantidad de elementos es de: ${readOnlyFiguras.count()} items")
        println("Circulo" in readOnlyFiguras)
        println(readOnlyFiguras)
        // readOnlyFiguras.add("Pentagono")
        val figura: MutableList<String> = mutableListOf("Cuadrado2", "Triangulo2", "Circulo2")
        println(figura)
        figura.add("Pentagono2")
        println(figura)
        figura.remove("Cuadrado2")
        println(figura)
    }
}