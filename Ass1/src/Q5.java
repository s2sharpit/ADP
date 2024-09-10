abstract class Marks {
    int markICP, markDSA;
    double percentage;

    Marks(int markICP, int markDSA) {
        this.markICP = markICP;
        this.markDSA = markDSA;
    }

    abstract void getPercentage();
}

class CSE extends Marks {
    int algoDesign;

    CSE(int markICP, int markDSA, int algoDesign) {
        super(markICP, markDSA);
        this.algoDesign = algoDesign;
    }

    @Override
    void getPercentage() {
        percentage = (markICP + markDSA + algoDesign) / 3.0;
        System.out.println("Percentage of CSE student: " + percentage);
    }
}

class NonCSE extends Marks {
    int enggMechanics;

    NonCSE(int markICP, int markDSA, int enggMechanics) {
        super(markICP, markDSA);
        this.enggMechanics = enggMechanics;
    }

    @Override
    void getPercentage() {
        percentage = (markICP + markDSA + enggMechanics) / 3.0;
        System.out.println("Percentage of Non-CSE student: " + percentage);
    }
}

public class Q5 {
    public static void main(String[] args) {
        CSE cseStudent = new CSE(80, 90, 85);
        cseStudent.getPercentage();
        NonCSE nonCseStudent = new NonCSE(75, 80, 70);
        nonCseStudent.getPercentage();
    }
}
