package Complementaries.SecondLevel;

import java.util.HashMap;
import java.util.HashSet;

public class Employees {
    public static void main(String[] args) {
        HashSet<Employee> employeeHashSet = new HashSet<>();
        HashMap<Integer, Float> salaries = new HashMap<>();

        employeeHashSet.add(new Employee("Empleado 1", 85532142, 1, 99654));
        employeeHashSet.add(new Employee("Empleado 2", 46632223, 2, 54233));
        employeeHashSet.add(new Employee("Empleado 3", 12553232, 3, 56432));
        employeeHashSet.add(new Employee("Empleado 4", 99656525, 6, 11225));

        for (Employee e : employeeHashSet) {
            salaries.put(e.getDni(), e.getSalary());
        }

        salaries.forEach((dni, salary) -> System.out.println("D.N.I.: " + dni + " - Sueldo: " + salary));
    }
}

class Employee {
    String name;
    int dni;
    float workHours;
    float pricePerHour;

    public Employee(String name, int dni, float workHours, float pricePerHour) {
        this.name = name;
        this.dni = dni;
        this.workHours = workHours;
        this.pricePerHour = pricePerHour;
    }

    public int getDni() {
        return dni;
    }

    public float getSalary() {
        return this.workHours * this.pricePerHour;
    }
}
