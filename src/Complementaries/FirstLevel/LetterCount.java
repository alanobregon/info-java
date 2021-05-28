package Complementaries.FirstLevel;

import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el texto: ");
        String text = scanner.nextLine();

        System.out.print("Ingrese la letra para contar: ");
        char letter = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (letter == text.charAt(i)) {
                count++;
            }
        }

        System.out.println("Cantidad de veces contadas: " + count);
    }
}
