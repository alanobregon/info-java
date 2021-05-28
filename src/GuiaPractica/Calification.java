package GuiaPractica;

import java.util.Scanner;

/**
 * Tendremos un sistema que debe clasificar el resultado
 * de una evaluación. Como dato de entrada tendremos un
 * entero y como resultado un String de la clasificación
 * de la siguiente forma:
 *
 * 93 - 100 | Excelente
 * 85 - 92  | Sobresaliente
 * 75 - 84  | Distinguido
 * 60 - 74  | Bueno
 * 00 - 59  | Desaprobado
 */
public class Calification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        do {
            System.out.println(calculate(enterNumber(scanner)));
            System.out.print("Ingrese 1 para repetir la operación: ");
            if (!scanner.nextLine().equals("1")) again = false;
        } while (again);
    }

    public static int enterNumber(Scanner scanner) {
        System.out.print("Ingrese el valor de la calificación: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static String calculate(int cal) {
        if (cal > 92) {
            return "Excelente";
        } else if (cal > 84) {
            return "Sobresaliente";
        } else if (cal > 74) {
            return "Distinguido";
        } else if (cal > 59) {
            return "Bueno";
        }

        return "Desaprobado";
    }
}
