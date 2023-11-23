package classSix.polymorphism;

public class Vehicle {
    String vehicleName;

    public Vehicle() {
        System.out.println("Constructor 1");
    }

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void vehicleDetails() {
        System.out.println("No info");
    }

    public void vehicleDetails(String vehicleName) {
        System.out.println("Car name is - " + vehicleName);
    }

    public void vehicleDetails(String vehicleName, int vehiclePrice) {
        System.out.println("Car name is - " + vehicleName);
        System.out.println("Car price is - " + vehiclePrice);
    }
}
