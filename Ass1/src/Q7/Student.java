package Q7;

import java.util.Scanner;

public class Student {
    protected String name;
    protected int roll;
    Scanner in = new Scanner(System.in);

    public void inputDetails() {
        System.out.print("Enter Student Name: ");
        name = in.nextLine();
        System.out.print("Enter Roll Number: ");
        roll = in.nextInt();
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}