package Complementaries.FirstLevel;

import java.util.Scanner;

/**
 * Se desea una aplicación que solicite 2 números enteros
 * y realice la operación de multiplicación por sumas sucesivas
 * (sin uso de librerías).
 */
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero a multiplicar: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese la cantidad de veces: ");
        int b = scanner.nextInt();
        scanner.close();

        int res = 0;
        for (int i = 0; i < b; i++) {
            res += a;
        }

        System.out.println("El resultado es: " + res);
    }
}
