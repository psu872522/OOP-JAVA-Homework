package homework;

public class Homework5 {
    public static void main(String[] args) {
        // Gregory-Leibniz series: 4/1 - 4/3 + 4/5 - 4/7 + ...
        double gregory = 0;
        int terms = 100000; 
        for (int k = 0; k < terms; k++) {
            double term = 4.0 / (2 * k + 1);
            if (k % 2 == 0) {
                gregory += term;
            } else {
                gregory -= term;
            }
        }
        System.out.println("Gregory-Leibniz 근사값: " + gregory);

        // Madhava series: sqrt(12) * sum( (-1/3)^k / (2k+1) )
        double madhava = 0;
        for (int k = 0; k < 20; k++) { 
            double term = Math.pow(-1.0 / 3.0, k) / (2 * k + 1);
            madhava += term;
        }
        madhava *= Math.sqrt(12);
        System.out.println("Madhava 근사값: " + madhava);

        System.out.println("실제 파이 값: " + Math.PI);
    }
}
