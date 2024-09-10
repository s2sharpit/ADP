interface DetailInfo {
    void display();

    int count();
}

class Student implements DetailInfo {
    static int maxCount;
    private String name;

    public void setter(String name) {
        this.name = name;
    }

    public String getter() {
        return name;
    }

    @Override
    public void display() {
        System.out.println("Student Name: " + getter());
    }

    public int count() {
        return name != null ? name.length() : 0;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setter("Tushar");
        student.display();
        System.out.println("Name Length: " + student.count());
    }
}
