package Q7;

import java.util.Scanner;

public class Test extends Student {
    public int mark1;
    public int mark2;
    Scanner in = new Scanner(System.in);

    @Override
    public void inputDetails() {
        super.inputDetails();  // Call the inputDetails() of Student class
        System.out.print("Enter Marks for Subject 1: ");
        mark1 = in.nextInt();
        System.out.print("Enter Marks for Subject 2: ");
        mark2 = in.nextInt();
    }

    @Override
    public void showDetails() {
        super.showDetails();  // Call the showDetails() of Student class
        System.out.println("Marks for Subject 1: " + mark1);
        System.out.println("Marks for Subject 2: " + mark2);
    }

}
