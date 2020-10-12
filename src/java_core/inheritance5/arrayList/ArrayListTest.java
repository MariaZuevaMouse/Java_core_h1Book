package java_core.inheritance5.arrayList;

import java_core.inheritance5.test1.Employee;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> stuff =new ArrayList<>();
        stuff.add(new Employee("Bob1",75000, 1987,12,15));
        stuff.add(new Employee("Bob2",50000, 1994,05,15));
        stuff.add(new Employee("Bob3",4000, 1987,3,13));

        for (Employee e: stuff){
            System.out.println("name  = " + e.getName()
                    + ", salary = " + e.getSalary()
                    + ", hireDay = " + e.getHireDay());
        }

        for (Employee e: stuff){
            e.raiseSalary(5);
        }
        for (Employee e: stuff){
            System.out.println("name  = " + e.getName()
                                + ", salary = " + e.getSalary()
                                + ", hireDay = " + e.getHireDay());
        }

    }
}
