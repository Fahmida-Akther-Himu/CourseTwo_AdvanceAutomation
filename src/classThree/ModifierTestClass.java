package classThree;

public class ModifierTestClass {
    public static void main(String[] args) {

        ModifierClass modifierClass = new ModifierClass();
        modifierClass.modifier1();    //public
        //modifierClass.modifier2();   //private
        modifierClass.modifier3();    //protected
        modifierClass.modifier4();  //default

        System.out.println(modifierClass.name1);  //public
        //System.out.println(modifierClass.name2);   //private
        System.out.println(modifierClass.name3);   //protected
        System.out.println(modifierClass.name4);   //default

    }
}
