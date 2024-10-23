package org.example.ejerciciosKotlin


/**
 * Crear una clase Anime con los atributos nombre, episodios y género.
 */
class Anime(val nombre:String, val episodios:Int, val genero:String) {

    fun mostrarInfo() {
        println("Nombre: $nombre, Episodios: $episodios, Género: $genero")
    }

}