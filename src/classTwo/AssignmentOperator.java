package classTwo;

public class AssignmentOperator {
    public static void main(String[] args) {
        int m = 10, n = 20, o = 30;
        int a = 11, b = 22, c = 33;
        a = m;
        System.out.println(a);
        b += n;
        System.out.println(b);
        c -= o;
        System.out.println(c);

        a *= m;
        System.out.println(a);
        b /= n;
        System.out.println(b);
        c %= o;
        System.out.println(c);
    }
}
