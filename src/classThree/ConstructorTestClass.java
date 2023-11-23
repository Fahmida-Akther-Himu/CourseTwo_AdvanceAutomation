package classThree;

public class ConstructorTestClass {
    public static void main(String[] args) {

        ConstructorClass constructorClass1 = new ConstructorClass();
        constructorClass1.constructorTest();

        ConstructorClass constructorClass2 = new ConstructorClass("Fahmida", 120);
        System.out.println(constructorClass2.name + " " + constructorClass2.id);

        ConstructorClass constructorClass3 = new ConstructorClass(constructorClass2);
        System.out.println(constructorClass3.name + " " + constructorClass3.id);

    }
}
