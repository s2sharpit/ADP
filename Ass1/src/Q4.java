class Employee1 {
    String name;
    int age;

    Employee1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class HR extends Employee1{
    int Eid;
    double salary;

    HR(String name, int age, int Eid, double salary) {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println(name + " " + age + " " + Eid + " " + salary);
    }
}

public class Q4 {
    public static void main(String[] args) {
        HR hr = new HR("Tushar", 20, 0210, 20000000);
        hr.displayDetails();
    }
}
