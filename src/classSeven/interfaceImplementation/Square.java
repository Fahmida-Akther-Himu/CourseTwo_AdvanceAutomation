package classSeven.interfaceImplementation;

public class Square implements Printable {
    public int width = 100;
    public int perimeter = 0;

    public int printPerimeter() {
        perimeter = width * 5;
        System.out.println("Print the formula of the perimeter : perimeter = width * 5");
        return perimeter;
    }

    @Override
    public void print() {
        System.out.println(printPerimeter());
        System.out.println();
        System.out.println("Perimeter of square is : " + printPerimeter() + " meters");
        System.out.println("Draw and print a square.");
    }

}