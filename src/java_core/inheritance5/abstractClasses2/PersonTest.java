package java_core.inheritance5.abstractClasses2;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("Lari Wilson", 5000, 1989,10,1);
        people[1] = new Student("Monika Wamp", "programmer");

        for(Person p : people){
            System.out.println(p.getName() +", " + p.getDescription());
        }
    }
}
