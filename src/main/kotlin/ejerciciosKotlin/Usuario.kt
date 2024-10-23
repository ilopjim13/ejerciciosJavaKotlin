package org.example.ejerciciosKotlin

class Usuario(val nombre:String, val videojuegos:MutableList<Videojuego>) {

    fun agregarJuego(juego:Videojuego) {
        videojuegos.add(juego)
    }

    fun eliminarJuego(videojuego: Videojuego) {
        videojuegos.remove(videojuego)
    }

    fun mostrarJuego() {
        videojuegos.forEach {
            println(it)
        }
    }
}