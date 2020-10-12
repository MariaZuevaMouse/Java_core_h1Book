package java_core.inheritance5.test1;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Karina Schultz", 10000, 2005,03,17);

        boss.setBonus(5000);

        Employee[] stuff = new Employee[3];
        stuff[0] = boss;
        stuff[1] = new Employee("Den Milman", 5000, 1999, 12,07 );
        stuff[2] = new Employee("Greg Busche",7000, 2007, 12, 07 );

        for(Employee e : stuff){
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
        }
    }
}
