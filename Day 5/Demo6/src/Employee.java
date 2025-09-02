public class Person {

    private String name;
    private int age;

    public Person() {
        // default constructor
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showRecord() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}

class Test {

    private String name;
    private int age;
    private int empoid;
    private int salary;

    public Test() {
        // default constructor
    }

    public Test(String name, int age, int empoid, int salary) {
        this.name = name;
        this.age = age;
        this.empoid = empoid;
        this.salary = salary;
    }

    public void printRecord() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("empoid: " + empoid);
        System.out.println("salary: " + salary);
    }
}

// Separate class with main method
public class Employee {

    public static void main(String[] args) {
    	Test emp2 = new Test("Dikshant", 20, 1, 50000);
        emp2.printRecord();

        System.out.println("------------------------");

        Person p2 = new Person("Dikshant", 20);
        p2.showRecord();
    }
}
