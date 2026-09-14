package homework;

public class Homework3 {
    public static void main(String[] args) {
        int n = 20;
        long[] fib = new long[n];
        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = 1; i < n; i++) {
            double ratio = (double) fib[i] / fib[i - 1];
            System.out.println(fib[i] + "/" + fib[i - 1] + "=" + ratio);
        }
    }
}
