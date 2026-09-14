public class BinaryConvert {
    public static void main(String[] args) {

        System.out.println(decToBinInt(257));
        System.out.println(decToBinInt(128));

        System.out.println(binToDec("101010"));
        System.out.println(binToDec("1110"));

        System.out.println(decToBin(1.625, 10));
        System.out.println(decToBin(1.5625, 10));
        System.out.println(decToBin(13.875, 10));
        System.out.println(decToBin(1.9, 15)); 
        System.out.println(decToBin(1.1, 15));
    }

    static String decToBinInt(int n) {
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.insert(0, n % 2);
            n /= 2;
        }
        return sb.toString();
    }

    static int binToDec(String bin) {
        int result = 0;
        for (int i = 0; i < bin.length(); i++) {
            result = result * 2 + (bin.charAt(i) - '0');
        }
        return result;
    }

    static String decToBin(double num, int fractionDigits) {
        int intPart = (int) num;
        double fracPart = num - intPart;

        String intBin = decToBinInt(intPart);

        StringBuilder fracBin = new StringBuilder();
        for (int i = 0; i < fractionDigits && fracPart > 0; i++) {
            fracPart *= 2;
            int bit = (int) fracPart;
            fracBin.append(bit);
            fracPart -= bit;
        }

        return intBin + "." + fracBin;
    }
}
