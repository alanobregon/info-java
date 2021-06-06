package Complementaries.FirstLevel;

import java.util.Scanner;

/**
 * Realizar un programa que calcule el factorial de un número:
 * n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
 * Sin hacer uso de librerías.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int number = scanner.nextInt();
        int fac = 1;
        scanner.close();

        for (int i = 1; i <= number; i++) {
            fac *= i;
        }

        System.out.println("El factorial es: " + fac);
    }
}
