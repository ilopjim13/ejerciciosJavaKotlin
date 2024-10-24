package ejerciciosJava;

/**
 * 13. Clase Anime sencilla
 * Crear una clase Anime con los atributos nombre, episodios y género.
 */
public class Anime {
    String nombre;
    int episodios;
    String genero;

    public Anime(String n, int e, String g) {
        this.nombre = n;
        this.episodios = e;
        this.genero = g;
    }

    public String mostrarInfo() {
        return "Nombre: " + nombre + ", Episodios: " + episodios + ", Género: " + genero;
    }
}
