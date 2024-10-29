package ejerciciosJava;

import java.util.List;

public class Usuario {
    String nombre;
    List<Videojuego> inventario;

    public Usuario(String n, List<Videojuego> i) {
        this.nombre = n;
        this.inventario = i;
    }

    public void agregarJuego(Videojuego juego) {
        inventario.add(juego);
    }

    public void eliminarJuego(Videojuego juego) {
        inventario.remove(juego);
    }

    public void mostrarJuego() {
        inventario.forEach(System.out::println);
    }

}
