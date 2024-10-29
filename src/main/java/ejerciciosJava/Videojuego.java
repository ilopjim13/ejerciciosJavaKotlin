package ejerciciosJava;


/**
 * 14. Inventario de videojuegos
 * Crear una clase Videojuego con los atributos titulo, plataforma y horasJugadas.
 */
public class Videojuego {
    String titulo;
    int horasJugadas;
    String plataforma;

    public Videojuego(String t, int h, String p) {
        this.titulo = t;
        this.horasJugadas = h;
        this.plataforma = p;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Plataforma: " + plataforma + ", Horas Jugadas: " + horasJugadas;
    }
}
