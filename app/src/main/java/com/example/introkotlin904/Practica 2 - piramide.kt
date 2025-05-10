package com.example.introkotlin904

fun main(){

    val numeroDePisos:Int

    println("Ingrese la cantidad de pisos que le gustaria que tuviera su piramide")
    numeroDePisos = readln().toInt()
    println("Su piramide tendra $numeroDePisos pisos y es la siguiente:")
    imprimir(numeroDePisos)
}

fun imprimir(numeroDePisos:Int){
    var fila:Int = 1
    var columna:Int

    while (fila <= numeroDePisos){
        columna = 1
        while (columna <= fila){
            print("*")
            columna++
        }
        println()
        fila++
    }
}