package ejerciciosJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosJava {


    public int pedirNum(String texto) {
        int num = -1;
        Scanner scanner = new Scanner(System.in);
        while(num < 0) {
            System.out.print(texto);
            try {
                num = scanner.nextInt();
            } catch (Exception e) {
                num = -1;
            }
            if (num < 0) {
                System.out.println("Error introduce un número válido.");
            }
        }
        return num;
    }

    /**
     * 1. Saludo personalizado
     * Pedir al usuario su nombre y saludarle con un mensaje personalizado. Ejemplo: "¡Hola,
     * Juan!".
     */
    public void ejercicio1() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola, " + nombre + "!");
    }

    /**
     * 2. Número par o impar
     * Pedir un número al usuario e indicar si es par o impar
     */
    public void ejercicio2() {
        int num = pedirNum(">> Introduce un número positivo: ");

        if (num % 2 == 0) System.out.println("El número es par");
        else System.out.println("El número es ");

    }

    /**
     * 3. Cálculo del área de un círculo
     * Pedir al usuario el radio de un círculo y calcular su área (A = π * r^2).
     */
    public void ejercicio3() {
        int r = pedirNum(">> Introduce el radio del círculo: ");

        double area = Math.PI * (r * r);
        System.out.println("El área del círculo es de: " + area);
    }


    /**
     * Generar un número aleatorio entre 1 y 100 y pedir al usuario que adivine qué número es.
     * El programa indicará si el número es mayor o menor al ingresado.
     * Pista: Utilizar la función de generación de números aleatorios y bucles while o do-while
     */
    public void ejercicio4() {
        Random random = new Random();
        int numRan = random.nextInt(100);
        int num = pedirNum(">> Introduce un número positivo: ");

        if (num > numRan) System.out.println("El número aleatorio es mayor que el introducido");
        else System.out.println("El número aleatorio es menor al introducido");

    }

    /**
     * 5. Tabla de multiplicar
     * Pedir un número al usuario e imprimir su tabla de multiplicar del 1 al 10.
     */
    public void ejercicio5() {
        int num = pedirNum(">> Introduce un número positivo: ");

        System.out.println("1 * " + num + " = " + (num));
        System.out.println("2 * " + num + " = " + (2 * num));
        System.out.println("3 * " + num + " = " + (3 * num));
        System.out.println("4 * " + num + " = " + (4 * num));
        System.out.println("5 * " + num + " = " + (5 * num));
        System.out.println("6 * " + num + " = " + (6 * num));
        System.out.println("7 * " + num + " = " + (7 * num));
        System.out.println("8 * " + num + " = " + (8 * num));
        System.out.println("9 * " + num + " = " + (9 * num));
        System.out.println("10 * " + num + " = " + (10 * num));
    }


    /**
     * 6. Sumar números del 1 al 100
     * Crear un programa que sume todos los números del 1 al 100.
     */
    public void ejercicio6() {
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            num += i;
        }
        System.out.println("La suma total de todos los números del 1 al 100 es de: " + num);
    }


    /**
     * 7. Reverso de una cadena
     * Pedir una cadena al usuario e imprimirla al revés.
     */
    public void ejercicio7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> Introduce una cadena: ");
        String cadena = scanner.nextLine();

        StringBuilder sb = new StringBuilder(cadena);
        System.out.println(cadena + " al revés es: " + (sb.reverse()));

    }


    /**
     * 8. Contador de vocales
     * Pedir una frase al usuario y contar cuántas vocales (a, e, i, o, u) contiene.
     */
    public void ejercicio8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> Introduce una frase: ");
        String frase = scanner.nextLine();

        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for(int cont = 0; cont < frase.length(); cont++) {
            if (frase.charAt(cont) =='a') a++;
            if (frase.charAt(cont) =='e') e++;
            if (frase.charAt(cont) =='i') i++;
            if (frase.charAt(cont) =='o') o++;
            if (frase.charAt(cont) =='u') u++;
        }

        System.out.println("La frase contiene un total de " + (a+e+i+o+u) + " vocales");
        System.out.println("A = " + a);
        System.out.println("E = " + e);
        System.out.println("I = " + i);
        System.out.println("O = " + o);
        System.out.println("U = " + u);
    }


    /**
     * 9. Números primos
     * Pedir un número al usuario y verificar si es un número primo.
     */
    public void ejercicio9() {
        int num = pedirNum(">> Introduce un número positivo: ");
        boolean esPrimo = num % 2 != 0;

        for(int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) System.out.println("Es primo");
        else System.out.println("No es primo");

    }


    /**
     * Crear un programa que convierta una temperatura de grados Celsius a Fahrenheit y
     * viceversa. (C = (F - 32) * 5/9, F = C * 9/5 + 32).
     */
    public void ejercicio10(){
        int f = 68;
        int c = 25;
        int conv = (f -32) * 5/9;
        int vice = c * 9/5 + 32;

        System.out.println("La temperatuda de " + f + " grados Fahrenheit es igual a " + conv + " grados Celsius");
        System.out.println("La temperatuda de " + c + " grados Celsius es igual a " + vice + " grados Fahrenheit");
    }


    /**
     * Crear un programa que imprima los primeros N números de la secuencia de Fibonacci (el
     * número N lo ingresa el usuario).
     */
    public void ejercicio11() {
        int n = pedirNum(">> Introduce el número de veces que quieres que se repita: ");
        int f = 0;
        int f2 = 1;
        int m = 0;

        for(int i = 1; i <= n; i++) {
            System.out.println(m);
            m = f + f2;
            f = f2;
            f2 = m;
        }

    }


    /**
     * 12. Inversión de un número
     * Pedir un número entero al usuario e imprimir el número con sus dígitos invertidos.
     * Ejemplo: si el usuario ingresa 1234, el programa debería imprimir 4321.
     */
    public void ejercicio12() {
        int num = pedirNum(">> Introduce un número positivo: ");
        StringBuilder sb = new StringBuilder(num);

        System.out.println("El número invertido es: " + (sb.reverse()));
    }


    /**
     * 13. Clase Anime sencilla
     * Crear una clase Anime con los atributos nombre, episodios y género. Luego, permitir al
     * usuario crear un objeto de tipo Anime con estos atributos y mostrar su información.
     */
    public void ejercicio13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del anime: ");
        String nombre = sc.nextLine();
        int episodios = pedirNum("Introduce el número de episodios del anime: ");
        System.out.print("Introduce el género del anime: ");
        String genero = sc.nextLine();

        Anime anime = new Anime(nombre, episodios, genero);
        System.out.println(anime.mostrarInfo());
    }


    /**
     * 14. Inventario de videojuegos
     * Crear una clase Videojuego con los atributos titulo, plataforma y horasJugadas. Permitir al
     * usuario crear un inventario con varios videojuegos. El programa debe permitir añadir,
     * eliminar y mostrar los videojuegos del inventario.
     */
    public void ejercicio14() {

        Usuario user = new Usuario("Pepe", new ArrayList<>());
        Videojuego juego = new Videojuego("Elden ring", 150, "pc");
        Videojuego juego2 = new Videojuego("GTA", 10, "pc");

        user.agregarJuego(juego);
        user.agregarJuego(juego2);

        user.mostrarJuego();

        user.eliminarJuego(juego2);

    }

    public static void main(String[] args) {
        EjerciciosJava ejercicio = new EjerciciosJava();
        ejercicio.ejercicio9();
    }


}






