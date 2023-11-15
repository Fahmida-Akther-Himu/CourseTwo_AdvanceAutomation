package classThree;

public class ConstructorClass {
    String name;
    int id;

    public ConstructorClass() {

    }

    public ConstructorClass(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public ConstructorClass(ConstructorClass constructorClass) {
        this.name = constructorClass.name;
        this.id = constructorClass.id;
    }


    public void constructorTest() {
        System.out.println("This is for testing");
    }


}
