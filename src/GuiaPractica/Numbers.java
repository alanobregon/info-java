package GuiaPractica;

import java.util.Scanner;

/**
 * Realizar un programa que al ejecutar se pueda ingresar 3
 * numeros enteros, para luego imprimirlos por pantalla de
 * la siguiente manera:
 *
 * El primer nro ingresado es: 4
 * El segundo nro ingresado es: 5
 * El tercer nro ingresado es: 6
 */
public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        int a, b, c;

        do {
            a = enterNumber(scanner);
            b = enterNumber(scanner);
            c = enterNumber(scanner);

            printNumber(a, b, c);
            System.out.print("Ingrese 1 para repetir la operación: ");
            if (!scanner.nextLine().equals("1")) again = false;
        } while (again);
        scanner.close();
    }

    public static int enterNumber(Scanner scanner) {
        System.out.print("Ingrese un numero: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void printNumber(int a, int b, int c) {
        System.out.println("El primer numero ingresado es: " + a);
        System.out.println("El segundo numero ingresado es: " + b);
        System.out.println("El tercer numero ingresado es: " + c);

    }
}
