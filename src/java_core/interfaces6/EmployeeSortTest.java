package java_core.interfaces6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Bob1", 35000);
        staff[1] = new Employee("Bob2", 75000);
        staff[2] = new Employee("Bob2", 38000);

        Arrays.sort(staff);

        for (Employee e : staff){
            System.out.println("name = " + e.getName() + ", salary = " +e.getSalary());
        }

    }
}
