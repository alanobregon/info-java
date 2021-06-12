package Propuestos.Employees;

import java.util.*;

public abstract class EmployeeUtil {

    /**
     * This method returns a employees list where
     * his last name begin with an specific letter
     * @param employees
     * @param letter
     * @return
     */
    public static List<Employee> getEmployeesByFirstLetterLastname(List<Employee> employees, String letter) {
        List<Employee> employeeList = new ArrayList<>();
        for (Employee employee : employees) {
            if (letter.equalsIgnoreCase(String.valueOf(employee.getLastname().charAt(0))))
                employeeList.add(employee);
        }

        return employeeList;
    }

    /**
     * This method returns a map with
     * the most old employee and
     * the most young employee
     * @param employees
     * @return
     */
    public static Map<String, Employee> getEmployeesOldYoung(List<Employee> employees) {
        Map<String, Employee> employeesMap = new HashMap<>();
        employees.sort(Comparator.comparing(Employee::getAge));

        employeesMap.put("Young", employees.get(0));
        employeesMap.put("Old", employees.get(employees.size() - 1));
        return employeesMap;
    }

    /**
     * Returns 2 employees with the
     * best and poor salary
     * @param employees
     * @return
     */
    public static Map<String, Employee> getEmployeesBestPoorSalary(List<Employee> employees) {
        Map<String, Employee> employeesMap = new HashMap<>();
        employees.sort(Comparator.comparing(Employee::getSalary));

        employeesMap.put("Poor", employees.get(0));
        employeesMap.put("Best", employees.get(employees.size() - 1));
        return employeesMap;
    }

    /**
     * Returns the same list of employees
     * but sorted by name and lastname
     * @param employees
     * @return
     */
    public static List<Employee> sortByNameLastname(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getLastname));
        return employees;
    }
}
