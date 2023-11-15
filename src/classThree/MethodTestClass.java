package classThree;

public class MethodTestClass {
    public static void main(String[] args) {
        MethodClass methodclass = new MethodClass();
        methodclass.nonPara();
        methodclass.para("fahmida");
        methodclass.nonReturnType("fahmida", "Himu");
        String fullName = methodclass.returnType("fahmida", "Himu");
        System.out.println(fullName);

    }
}
