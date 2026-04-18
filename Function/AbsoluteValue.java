// 5_AbsoluteValue.java
public class AbsoluteValue {
    static int absolute(int a) {
        if (a >= 0)
            return a;
        else
            return -a;
    }

    public static void main(String[] args) {
        System.out.println(absolute(-5));
    }
}