package ejerciciosJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjerciciosJava {

    /**
     * 1. Saludo personalizado
     * Pedir al usuario su nombre y saludarle con un mensaje personalizado. Ejemplo: "¡Hola,
     * Juan!".
     */
    public void ejercicio1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(">> Introduce tu nombre: ");

        String nombre = br.readLine();

        System.out.println("¡Hola, " + nombre + "!");
    }

    /**
     * 2. Número par o impar
     * Pedir un número al usuario e indicar si es par o impar
     */
    public void ejercicio2() {

    }

}

