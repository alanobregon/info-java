package Propuestos.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Employees {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        employeeArrayList.add(new Employee("Empleado", "Uno", 11111111, 45000));
        employeeArrayList.add(new Employee("Empleado", "Dos", 22222222, 23000));
        employeeArrayList.add(new Employee("Empleado", "Tres", 33333333, 65000));
        employeeArrayList.add(new Employee("Empleado", "Cuatro", 44444444, 98000));
        employeeArrayList.add(new Employee("Empleado", "Cinco", 55555555, 12000));

        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter("src/Propuestos/IO/employees.txt");
            printWriter = new PrintWriter(fileWriter);
            for (Employee employee : employeeArrayList) {
                printWriter.println(employee.getFirstname() + "," + employee.getLastname() + "," + employee.getDni() + "," + employee.getSalary());
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (null != fileWriter)
                    fileWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

class Employee {
    private String firstname;
    private String lastname;
    private int dni;
    private float salary;

    public Employee(String firstname, String lastname, int dni, float salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dni = dni;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}