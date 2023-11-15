package classThree;

public class ModifierClass {


    public String name1 = "Akther";
    private String name2 = "Fahmida";
    protected String name3 = "Himu";

    String name4 = "Tanveer";

    public void modifier1() {
        System.out.println("This is public modifier");
    }

    private void modifier2() {
        System.out.println("This is private modifier");
    }

    protected void modifier3() {
        System.out.println("This is protected modifier");
    }

    void modifier4() {
        System.out.println("This is default modifier");
    }
}
