class Deposit {
    long principal;
    int time;
    double rate;
    double totalAmt;

    Deposit() {}
    Deposit(long principal, int time, double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
        calcAmt();
    }
    Deposit(long principal, int time) {
        this.principal = principal;
        this.time = time;
        calcAmt();
    }
    Deposit(long principal, double rate) {
        this.principal = principal;
        this.rate = rate;
        calcAmt();
    }
    
    void calcAmt() {
        this.totalAmt = principal + (principal * rate * time) / 100;
    }

    void display() {
        System.out.println("Principal: " + principal);
        System.out.println("Time: " + time);
        System.out.println("Rate: " + rate);
        System.out.println("Total Amount: " + totalAmt);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Deposit deposit1 = new Deposit(); // Default constructor
        deposit1.display();

        Deposit deposit2 = new Deposit(10000, 2, 5.0); // Constructor with principal, time, and rate
        deposit2.display();

        Deposit deposit3 = new Deposit(5000, 3); // Constructor with principal and time
        deposit3.display();

        Deposit deposit4 = new Deposit(8000, 4.5); // Constructor with principal and rate
        deposit4.display();
    }

}
