package classFour.jumpStatements;

public class BreakStatementTest {
    public static void main(String[] args) {

        int number = 23, flag = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Even number");
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Odd number");
        }

    }
}
