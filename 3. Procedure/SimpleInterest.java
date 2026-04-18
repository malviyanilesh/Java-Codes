public class SimpleInterest {
    static void si(int p, double r, double t) {
        double ans = (p * r * t) / 100;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        si(1000, 3.4, 4.5);
    }
}