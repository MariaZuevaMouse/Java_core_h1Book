package java_core.objectClasses4.constructorTest;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for(Employee e : staff)
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
                    + e.getSalary());
    }
}
class Employee{
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;


    // static initialization block
    static{
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }
    // object initialization block
    {
        id = nextId;
        nextId++;
    }

    public Employee(String n, double s){
        name = n;
        salary = s;
    }


    public Employee(double s){
        // calls the Employee(String, double) constructor
        this("Employee #" + nextId, s);
    }


    public Employee(){}

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }

}
