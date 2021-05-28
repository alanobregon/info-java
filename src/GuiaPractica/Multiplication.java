package GuiaPractica;

import java.util.Scanner;

/**
 * Desarrollar un programa que dado un número entero ingresado,
 * nos retorne los valores de ese número multiplicado por 1, 2, 3, … y 10.
 *
 * Ejemplo para el dato de entrada: 2
 * Salida:
 * 2 * 1 = 2
 * 2 * 2 = 4
 * 2 * 3 = 6
 * 2 * 4 = 8
 * 2 * 5 = 10
 * 2 * 6 = 12
 * 2 * 7 = 14
 * 2 * 8 = 16
 * 2 * 9 = 18
 * 2 * 10 = 20
 */
public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;

        String[] table;
        do {
            table = multiplicationTable(scanner);
            for (String row : table) {
                System.out.println(row);
            }

            System.out.print("Ingrese 1 para repetir la operación: ");
            if (!scanner.nextLine().equals("1")) again = false;
        } while (again);
    }

    public static String[] multiplicationTable(Scanner scanner) {
        String[] table = new String[10];

        System.out.print("Ingrese el numero a multiplicar: ");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < table.length; i++) {
            table[i] = number + " * " + (i + 1) + " = " + (number * (i+1));
        }

        return table;
    }
}
