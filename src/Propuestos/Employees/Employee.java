package Propuestos.Employees;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employee {
    private String name;
    private String lastname;
    private LocalDate birth;
    private float salary;

    public Employee(String name, String lastname, String birth, String salary) {
        this.name = name;
        this.lastname = lastname;
        this.birth = LocalDate.parse(birth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.salary = Float.parseFloat(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setBirth(String birth) {
        this.birth = LocalDate.parse(birth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        Period difference = Period.between(this.birth, LocalDate.now());
        return difference.getYears();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birth=" + birth.toString() +
                ", salary=" + salary +
                '}';
    }
}
