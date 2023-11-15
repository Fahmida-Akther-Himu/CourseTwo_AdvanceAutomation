package classSix.polymorphism;

public class OverLoadingTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle vehicleOne = new Vehicle("Ford");
        System.out.println(vehicleOne.vehicleName);

        vehicle.vehicleDetails();
        vehicle.vehicleDetails("BMW");
        vehicle.vehicleDetails("Ferrari", 90000);
    }
}
