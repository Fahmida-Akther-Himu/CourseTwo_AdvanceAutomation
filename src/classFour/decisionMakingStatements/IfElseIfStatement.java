package classFour.decisionMakingStatements;

public class IfElseIfStatement {
    public static void main(String[] args) {
        int number = -9;

        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Number is 0");
        }
    }
}
