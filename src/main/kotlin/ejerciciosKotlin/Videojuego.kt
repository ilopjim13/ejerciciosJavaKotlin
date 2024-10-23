package org.example.ejerciciosKotlin


/**
 * 14. Inventario de videojuegos
 * Crear una clase Videojuego con los atributos titulo, plataforma y horasJugadas. Permitir al
 * usuario crear un inventario con varios videojuegos.
 */
class Videojuego(val titulo:String, val plataforma:String, val horaJugadas:Int) {
    override fun toString(): String {
        return "Título: $titulo, Plataforma: $plataforma, Horas jugadas: $horaJugadas"
    }
}