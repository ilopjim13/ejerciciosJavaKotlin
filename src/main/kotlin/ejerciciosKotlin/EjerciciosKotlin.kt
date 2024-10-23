package org.example.ejerciciosKotlin


fun pedirNumeroPositivo(texto:String):Double {
    var num:Double
    do{
        print(texto)
        num = readln().toDoubleOrNull() ?: -1.0
        if (num < 0) println("¡Número erróneo!")
    } while (num < 0)
    return num
}

fun pedirOpcion(texto:String,opcion:Int):Int {
    var num:Int
    do{
        print(texto)
        num = readln().toIntOrNull() ?: -1
        if (num !in (1..opcion)) println("¡Número erróneo!")
    } while (num !in (1..opcion))
    return num
}


/**
 * 1. Saludo personalizado
 * Pedir al usuario su nombre y saludarle con un mensaje personalizado. Ejemplo: "¡Hola,
 * Juan!".
 */
fun ejercicio1() {
    print(">> Introduce tu nombre: ")
    val nombre = readln()
    println("¡Hola, $nombre!")
}

/**
 * 2. Número par o impar
 * Pedir un número al usuario e indicar si es par o impar.
 */
fun ejercicio2() {
    val num = pedirNumeroPositivo(">> Introduce un número positivo: ").toInt()
    if (num % 2 == 0) println("El número es par")
    else println("El número es impar")
}

/**
 * 3. Cálculo del área de un círculo
 * Pedir al usuario el radio de un círculo y calcular su área (A = π * r^2).
 */
fun ejercicio3() {
    var r = pedirNumeroPositivo(">> Introduce un número positivo: ")

    println("El área de este círculo es de ${(Math.PI * (r * r))}")
}

/**
 * 4. Generador de números aleatorios
 * Generar un número aleatorio entre 1 y 100 y pedir al usuario que adivine qué número es.
 * El programa indicará si el número es mayor o menor al ingresado.
 * Pista: Utilizar la función de generación de números aleatorios y bucles while o do-while.
 */
fun ejercicio4() {
    val random = (1..100).random()
    val num = pedirOpcion(">> Introduce un número entre el 1 y el 100: ", 100)

    if (random > num) println("El número random es mayor al introducido")
    else println("El número random es menor al introducido")
}

/**
 * 5. Tabla de multiplicar
 * Pedir un número al usuario e imprimir su tabla de multiplicar del 1 al 10
 */
fun ejercicio5() {
    var num = pedirNumeroPositivo(">> Introduce un número positivo: ").toInt()

    println("1 * $num = ${1 * num}")
    println("2 * $num = ${2 * num}")
    println("3 * $num = ${3 * num}")
    println("4 * $num = ${4 * num}")
    println("5 * $num = ${5 * num}")
    println("6 * $num = ${6 * num}")
    println("7 * $num = ${7 * num}")
    println("8 * $num = ${8 * num}")
    println("9 * $num = ${9 * num}")
    println("10 * $num = ${10 * num}")
}

/**
 * 6. Sumar números del 1 al 100
 * Crear un programa que sume todos los números del 1 al 100
 */
fun ejercicio6() {
    var num = 0
    (1..100).forEach{ num += it }
    println("Todos los números sumados del 1 al 100 es igual a: $num")
}

/**
 * 7. Reverso de una cadena
 * Pedir una cadena al usuario e imprimirla al revés.
 */
fun ejercicio7() {
    print(">> Introduce una cadena: ")
    val cadena = readln()
    println(cadena.reversed())
}

/**
 * 8. Contador de vocales
 * Pedir una frase al usuario y contar cuántas vocales (a, e, i, o, u) contiene.
 */
fun ejercicio8() {
    print(">> Introduce una frase: ")
    val frase = readln()
    var a = 0
    var e = 0
    var i = 0
    var o = 0
    var u = 0
    frase.forEach {
        when(it) {
            'a' -> a++
            'e' -> e++
            'i' -> i++
            'o' -> o++
            'u' -> u++
        }
    }

    println("La frase tiene un total de: ${a + e + i + o + u} vocales")
    println("a = $a")
    println("e = $e")
    println("i = $i")
    println("o = $o")
    println("u = $u")
}

/**
 * 9. Números primos
 * Pedir un número al usuario y verificar si es un número primo.
 */
fun ejercicio9() {
    val num = pedirNumeroPositivo(">> Introduce un número positivo: ").toInt()

}

/**
 * 10. Conversión de temperaturas
 * Crear un programa que convierta una temperatura de grados Celsius a Fahrenheit y
 * viceversa. (C = (F - 32) * 5/9, F = C * 9/5 + 32).
 */
fun ejercicio10() {
    val f = 80
    val c = 27
    val conver = (f -32) * 5/9
    val vice = c * 9/5 + 32

    println("$f grados Fahrenheit en Celsius son: $conver")
    println("$c grados Celsius en Fahrenheit son: $vice")
}

/**
 * 11. Fibonacci
 * Crear un programa que imprima los primeros N números de la secuencia de Fibonacci (el
 * número N lo ingresa el usuario).
 */
fun ejercicio11() {

    val n = pedirNumeroPositivo(">> Introduce un número positivo: ").toInt()
    var f = 0
    var f2 = 1
    for (i in 1..n) {
        println(f)
        println(f2)
        f += f2
        f2 += f
    }
}

/**
 * 12. Inversión de un número
 * Pedir un número entero al usuario e imprimir el número con sus dígitos invertidos.
 * Ejemplo: si el usuario ingresa 1234, el programa debería imprimir 4321.
 */
fun ejercicio12() {
    val num = pedirNumeroPositivo(">> Introduce un número positivo: ").toInt()
    val numRev = num.toString().reversed()
    println("El número $num al revés es: $numRev")
}


/**
 * 13. Clase Anime sencilla
 * Crear una clase Anime con los atributos nombre, episodios y género. Luego, permitir al
 * usuario crear un objeto de tipo Anime con estos atributos y mostrar su información.
 */
fun ejercicio13() {

    print("Indique el nombre del anime: ")
    val nombre = readln()

    var episodios: Int

    do {
        print("Indique la cantidad de episodios que tiene: ")
        episodios = readln().toIntOrNull() ?: -1
        if(episodios<0) println("Número de episodios incorrecto")
    } while (episodios < 0)

    print("Indique el género del anime: ")
    val genero = readln()

    val anime = Anime(nombre, episodios, genero)
    anime.mostrarInfo()
}


/**
 * 14. Inventario de videojuegos
 * Crear una clase Videojuego con los atributos titulo, plataforma y horasJugadas. Permitir al
 * usuario crear un inventario con varios videojuegos. El programa debe permitir añadir,
 * eliminar y mostrar los videojuegos del inventario.
 */
fun ejercicio14() {

    val usuario = Usuario("Pepe", mutableListOf())

    var opcion:Int
    do {
        menu()

        opcion = pedirOpcion(">> Selecciona una opción: ",4)

        ejecutarMenu(opcion, usuario)
    } while (opcion != 4)

}

fun ejecutarMenu(opcion: Int, usuario: Usuario) {
    when(opcion) {
        1 -> agregar(usuario)
        2 -> eliminar(usuario)
        3 -> usuario.mostrarJuego()
    }
}

fun agregar(usuario: Usuario) {
    print("Indique el nombre del juego: ")
    val nombre = readln()
    print("Indique la plataforma del juego: ")
    val plataforma = readln()

    var horas:Int
    do {
        print("Introduce las horas jugadas: ")
        horas = readln().toIntOrNull()?: -1
        if(horas<0) println("Número de horas incorrecta")
    } while (horas < 0)

    val videojuego = Videojuego(nombre, plataforma, horas)
    usuario.agregarJuego(videojuego)
}

fun eliminar(usuario: Usuario) {

    var juego:Videojuego? = null
    while (juego == null) {
        print("Indique el nombre del juego a eliminar: ")
        val nombre = readln()
        juego = usuario.videojuegos.find { it.titulo == nombre }
        if (juego == null) println("Este juego no existe en tu inventario")
    }

    usuario.eliminarJuego(juego)
}

fun menu() {
    println("1. Agregar videojuego")
    println("2. Eliminar videojuego")
    println("3. Mostrar videojuego")
    println("4. Salir")
}