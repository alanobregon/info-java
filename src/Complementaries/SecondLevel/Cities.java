package Complementaries.SecondLevel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear un ArrayList y cargarlo con tus ciudades
 * favoritas de Argentina, luego imprimir por pantalla
 * el ranking
 */
public class Cities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> favourite = new ArrayList<>();

        boolean again = true;
        do {
            System.out.print("¿Quiere agregar una ciudad? [s/n]: ");
            switch (scanner.nextLine().charAt(0)) {
                case 's':
                    System.out.print("Ingrese el nombre de la ciudad: ");
                    favourite.add(scanner.nextLine());
                    break;
                case 'n':
                    again = false;
                    break;
                default:
                    System.out.println("La opción ingresada no es valida.");
                    break;
            }
        } while (again);
        scanner.close();

        System.out.println("Sus ciudades favoritas son: ");
        for (int i = 0; i < favourite.size(); i++) {
            System.out.println("#" + (i+1) + " - " + favourite.get(i));
        }
    }
}
