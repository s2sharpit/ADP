import Q7.Test;

interface Sports {
    int score1 = 10;
    int score2 = 15;
}

public class Q7 implements Sports {
    public static void main(String[] args) {
        Test stest = new Test();
        
        stest.inputDetails();
        stest.showDetails();

        int totalMarks = stest.mark1 + stest.mark2;

        int totalScore = score1 + score2;
        
        int grandTotal = totalMarks + totalScore;
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Total Sports Score: " + totalScore);
        System.out.println("Grand Total (Marks + Sports Score): " + grandTotal);

    }
}
