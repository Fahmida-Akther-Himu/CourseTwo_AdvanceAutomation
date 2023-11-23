package classFive.variable;

public class Student {

    String name;
    public long id;
    public static int mark = 100;

    public void printNumber() {
        int number = 10;
        System.out.println(number);
    }

    public void printInfo() {
        String name = "Fahmida";
        long id = 1800;
        System.out.println(name);
        System.out.println(id);
    }

    public static void printMark() {
        System.out.println(mark);
    }

    /*
    public static void main(String[] args) {
        printMark();  // can only call directly static method without creating any object
    }
     */

}
