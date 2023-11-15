package classFour.decisionMakingStatements;

public class NestedIfStatement {
    public static void main(String[] args) {

        int number = -87;
        if (number > 0) {
            if (number <= 100) {
                System.out.println("Number is between 1 to 100");
            } else {
                System.out.println("Number is grater than 100");
            }
        } else {
            System.out.println("This is a non positive number");
        }


    }
}
