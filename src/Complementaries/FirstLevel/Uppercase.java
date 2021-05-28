package Complementaries.FirstLevel;

import java.util.Scanner;

/**
 * Realizar un Programa que dado un String de entrada
 * en minúsculas lo convierta por completo a mayúsculas.
 * Sin uso de métodos o librerías que realicen toUppercase().
 */
public class Uppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char letter;

        for (int i = 0; i < text.length(); i++) {
            letter = text.charAt(i);
            if (letter >= 97 && letter <= 122) {
                letter -= 32;
            }

            System.out.print(letter);
        }
    }
}
