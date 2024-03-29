package java_core.generics8.pair3;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary += raise;
    }
}
