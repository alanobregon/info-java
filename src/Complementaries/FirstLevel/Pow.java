package Complementaries.FirstLevel;

import java.util.Scanner;

/**
 * Se desea una aplicación que solicite 2 números enteros
 * y realice la operación de potencia (sin uso de librerías).
 */
public class Pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el exponente: ");
        int b = scanner.nextInt();
        scanner.close();

        int res = 1;
        for (int i = 1; i <= b ; i++) {
            res *= a;
        }

        System.out.println("El resultado es: " + res);
    }
}
