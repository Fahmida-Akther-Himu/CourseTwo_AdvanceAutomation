package classFive.encapsultion;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.printColour();
        car.setCarModel("BMW");
        car.setCarNo(874);
        System.out.println(car.getCarModel());
        System.out.println(car.getCarNo());


    }
}
