package homework;

public class Homework12 {
    public static void main(String[] args) {

        System.out.println("int 78 = " + intToBinaryString(78));
        System.out.println("int -78 = " + intToBinaryString(-78));
        System.out.println("int -34 = " + intToBinaryString(-34));

        printDoubleBits(2.3);
        printDoubleBits(13.875);
        printDoubleBits(45.5625);
    }

    static String intToBinaryString(int n) {
        StringBuilder sb = anew StringBuilder();
        for (int i = 31; i >= 0; i--) {
            sb.append((n >> i) & 1);
            if (i % 8 == 0 && i != 0) sb.append(" ");
        }
        return sb.toString();
    }

    static void printDoubleBits(double value) {
        long bits = Double.doubleToLongBits(value);

        String sign = ((bits >> 63) & 1) == 1 ? "1" : "0";

        StringBuilder exponent = new StringBuilder();
        for (int i = 62; i >= 52; i--) {
            exponent.append((bits >> i) & 1);
        }

        StringBuilder mantissa = new StringBuilder();
        for (int i = 51; i >= 0; i--) {
            mantissa.append((bits >> i) & 1);
        }

        System.out.println("value = " + value);
        System.out.println("sign = " + sign);
        System.out.println("exponent = " + exponent + " (" + (Long.parseLong(exponent.toString(), 2) - 1023) + ")");
        System.out.println("mantissa = " + mantissa);
        System.out.println();
    }
}
