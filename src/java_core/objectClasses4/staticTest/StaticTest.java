package java_core.objectClasses4.staticTest;

public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee("Carl", 60000);
        staff[2] = new Employee("Tony", 50000);
        for(Employee e : staff){
            e.setId();
            System.out.println("name= " + e.getName() + ", id = " +e.getId() +
                    ", salary = " +e.getSalary());
        }
    }
}

class Employee{
    private static int nextId;

    private int id;
    private String name ;
    private double salary;




    public Employee(String n, double s){
        name = n;
        salary = s;
        id= 0;
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
    public void setId(){
        id = nextId;
        nextId++;
    }
    public static void main(String[] args) {
        Employee e = new Employee("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }

}
