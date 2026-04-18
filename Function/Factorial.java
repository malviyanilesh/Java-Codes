// 6_Factorial.java
public class Factorial {
    static int factorial(int n) {
        int fact = 1;

        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}