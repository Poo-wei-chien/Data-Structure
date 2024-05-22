package L09_recursion.L9.Question3;

public class q3 {
    public static long exponent(int x, int m) {
        if (m == 0) { return 1; }
        if (m == 1) { return x; }
        return x * exponent(x, m-1);
    }
    public static void main(String[] args) {
        int x = 10, y = 3;
        System.out.println("F("+x+", "+y+") = " + exponent(x, y));
    }
}
