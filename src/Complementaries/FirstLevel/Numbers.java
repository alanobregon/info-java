package Complementaries.FirstLevel;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese otro numero: ");
        int b = scanner.nextInt();

        System.out.println("Suma: " + (a+b));
        System.out.println("Resta: " + (a-b));
        System.out.println("Multiplicación: " + (a*b));
        System.out.println("División: " + (a/b));
        System.out.println("Resto: " + (a%b));
    }
}
