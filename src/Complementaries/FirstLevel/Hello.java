package Complementaries.FirstLevel;

import java.util.Scanner;

/**
 * Solicitar por consola el nombre del usuario
 * e imprimir por pantalla el siguiente mensaje
 * “HOLA {USUARIO}!!!”
 */
public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String name = scanner.nextLine();
        scanner.close();

        System.out.println("Hola " + name);
    }
}
