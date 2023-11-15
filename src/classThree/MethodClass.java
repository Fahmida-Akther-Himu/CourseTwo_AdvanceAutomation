package classThree;

public class MethodClass {


    public void nonPara() {
        String name = "Fahmida";
        System.out.println(name);
    }

    public void para(String name) {
        System.out.println(name);
    }


    public void nonReturnType(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }

    public String returnType(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return fullName;
    }
}
