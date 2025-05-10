package com.example.introkotlin904

fun main(){

    var numero1:Double = 0.0
    var numero2:Double = 0.0
    var entrar:Int = 0

    do {
        print("Ingrese el proceso que desea realizar: " + "\n" +
                "1 - Suma " + "\n" +
                "2 - Resta " + "\n" +
                "3 - Division "  + "\n" +
                "4 - Multiplicacion " + "\n" +
                "5 - Salir" + "\n"
        )
        val proceso = readln().toInt()
        entrar = proceso
        println("Has elegido realizar el proceso $proceso")

        when(proceso) {
            1 -> {
                println("Ingrese el primer numero")
                numero1 = readln().toDouble()
                println("Ingrese el segundo numero")
                numero2 = readln().toDouble()
                suma(numero1, numero2)
            }

            2 -> {
                println("Ingrese el primer numero")
                numero1 = readln().toDouble()
                println("Ingrese el segundo numero")
                numero2 = readln().toDouble()
                resta(numero1, numero2)
            }

            3 -> {
                println("Ingrese el primer numero")
                numero1 = readln().toDouble()
                println("Ingrese el segundo numero")
                numero2 = readln().toDouble()
                division(numero1, numero2)
            }

            4 -> {
                println("Ingrese el primer numero")
                numero1 = readln().toDouble()
                println("Ingrese el segundo numero")
                numero2 = readln().toDouble()
                multiplicacion(numero1, numero2)
            }
            else -> println("Ha decidio salir, muchas gracias")
        }
    } while(entrar != 5)
}

/*fun ingresoDeDatos(numero1:Double, numero2:Double){
    println("Ingrese primer numero")
    numero1 = readln().toDouble()
    println("Ingrese el segundo numero")
    numero2 = readln().toDouble()}*/

fun suma(numero1:Double, numero2:Double){
    println("El resultado de la suma es de: ${numero1 + numero2}")
}

fun resta(numero1:Double, numero2:Double){
     println("El resultado de la resta es de :${numero1 - numero2}")
}

fun division(numero1:Double, numero2:Double){
    println("El resultado de la division es de :${numero1 / numero2}")
}

fun multiplicacion(numero1:Double, numero2:Double){
    println("El resultado de la multiplicacion es de :${numero1 * numero2}")
}
