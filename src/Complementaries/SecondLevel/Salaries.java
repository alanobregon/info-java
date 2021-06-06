package Complementaries.SecondLevel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Dados 2 ArrayList que contienen horas-trabajadas (array1)
 * y valor-por-hora(array2) del resumen de carga de horas
 * semanal de un empleado. Se debe generar otra lista que
 * contenga los totales y luego imprimir el total final a cobrar.
 */
public class Salaries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] days = new String[]{"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        ArrayList<Integer> workHours = new ArrayList<>();
        ArrayList<Integer> pricePerHour = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println(days[i]);
            System.out.print("Ingrese cantidad de horas trabajadas: ");
            workHours.add(scanner.nextInt());

            System.out.print("Ingrese el precio por hora trabajada: ");
            pricePerHour.add(scanner.nextInt());
        }
        scanner.close();

        ArrayList<Integer> totalPrices = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            totalPrices.add(workHours.get(i) * pricePerHour.get(i));
        }

        int cant = 0;
        for (int i = 0; i < 5; i++) {
            cant += totalPrices.get(i);
            System.out.println(days[i] + ": " + totalPrices.get(i));
        }

        System.out.print("\nTotal final: $" + cant);
    }
}
