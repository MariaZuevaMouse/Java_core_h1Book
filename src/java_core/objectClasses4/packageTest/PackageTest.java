package java_core.objectClasses4.packageTest;

import static java.lang.System.out;

import java_core.objectClasses4.packageTest.com.mari.corejava.*;

public class PackageTest {
    public static void main(String[] args) {
        Employee mari = new Employee("Mari Cooper", 50000, 1999, 10,1);

        mari.raiseSalary(50);
        out.println("name = " + mari.getName() + ", salary = " +mari.getSalary());
    }
}
