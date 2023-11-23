package classFive.encapsultion;

public class Car {

    private String carModel;
    private int carNo;
    String colour = "Black";

    public void printColour() {
        System.out.println(colour);
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }


    public String getCarModel() {
        return carModel;
    }

    public int getCarNo() {
        return carNo;
    }

}
