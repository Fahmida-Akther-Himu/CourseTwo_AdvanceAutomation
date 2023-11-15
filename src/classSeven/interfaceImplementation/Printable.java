package classSeven.interfaceImplementation;

public interface Printable {
    int oneSide = 10;

    void print();

    default void make() {
        showPicture();
        System.out.println("Please make a square.");
    }

    static int showArea() {
        return oneSide * oneSide;
    }

    private void showPicture() {
        System.out.println("Private Method");

    }

    private static void seeSquare(int length) {
        System.out.println(showArea());
    }
}
