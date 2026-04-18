// 7_SwapByValue.java
public class SwapByValue {
    static void test(int x, int y) {
        int z;

        z = x;
        x = y;
        y = z;

        System.out.println("Inside Function:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {
        int x = 10, y = 20;

        test(x, y);

        System.out.println("Outside Function:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}