import java.util.Scanner;

class Employee {
    String name;
    double salary;
    int age;

    void setData(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age + "\n");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.age = 25;
        e1.name = "Joseph";
        e1.salary = 65784.5;
        e1.displayData();

        Employee e2 = new Employee();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name, Salary, Age: ");
        e2.setData(in.nextLine(), in.nextDouble(), in.nextInt());
        e2.displayData();

        System.out.println(e1.age > e2.age ? e1.name : e2.name + " is older");

        in.close();
    }
}
