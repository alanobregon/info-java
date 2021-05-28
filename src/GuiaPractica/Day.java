package GuiaPractica;

import java.util.Scanner;

/**
 * Realizar un programa que dado un número de
 * entrada entre 1 a 7, nos devuelva el dia de
 * la semana de la siguiente forma:
 *
 * 1 | Domingo
 * 2 | Lunes
 * 3 | Martes
 * 4 | Miercoles
 * 5 | Jueves
 * 6 | Viernes
 * 7 | Sabado
 */
public class Day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        do {
            System.out.println(weekDay(scanner));
            System.out.print("Ingrese 1 para repetir la operación: ");
            if (!scanner.nextLine().equals("1")) again = false;
        } while (again);
    }

    public static String weekDay(Scanner scanner) {
        System.out.print("Ingrese el numero del dia: ");
        int day = Integer.parseInt(scanner.nextLine());

        switch (day) {
            case 1: return "Domingo";
            case 2: return "Lunes";
            case 3: return "Martes";
            case 4: return "Miercoles";
            case 5: return "Jueves";
            case 6: return "Viernesuki";
            case 7: return "Sabaduki";
            default: return "El numero ingresado no corresponde a un dia valido.";
        }
    }
}