package com.example.introkotlin904
class IntroKotlin904 {
    fun main(){

        //Variables de solo lectura (Variables Inmutables)
        val a = 4
        val b = 8

        //Variables Mutables VAR
        var c = 3
        /*a = 8*/
        c = 9

        println(a)
        println("El valor de B es  $b")
        println("El valor de C +2 es de ${c+2}")

        c = a+2
        c += 8
        c -= 6
        c *= 7
        c /= 3
        println("El valor de C es de $c")

        val num1:Int=23
        val num2:Int=12
        /*num2 = 6*/

        var nombre:String = "Ruben"
        var caracter:Char = 'a'

        var num4:Float = 12.5f
        var num5:Double = 12.5
    }
}