package Complementaries.FirstLevel;

import java.util.Scanner;

/**
 * Confeccionar un programa que dado un número entero como
 * dato de entrada imprima la secuencia de números
 * (incrementos de 1) de la siguiente forma:
 *
 * Entrada: 5
 * Salida:
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */
public class Secuence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println("");
        }
    }
}
