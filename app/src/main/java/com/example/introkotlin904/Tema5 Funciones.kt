package com.example.introkotlin904

fun saludo(){
    println("Hola Mundo")
}

fun suma(a:Int, b:Int){
    println("La suma de $a y $b es ${a+b}")
}

fun resta(a:Int, b:Int):Int{
    return a-b
}

fun resta2(a:Int, b:Int):Int = a-b

fun main (){
    saludo()
    suma(2,3)
    println("La resta de 2 y 3 es ${resta(2,3)}")
}