package homework;

	import java.util.Arrays;

	public class Homework11 {
	    public static void main(String[] args) {
	        int[] data = {23, 34, 56, 12, 34, 56, 67};

	        System.out.println("arithmetic mean = " + arithmeticMean(data));
	        System.out.println("geometric mean = " + geometricMean(data));
	        System.out.println("harmonic mean = " + harmonicMean(data));
	        System.out.println("median = " + median(data));
	    }

	    // 산술평균
	    static double arithmeticMean(int[] data) {
	        double sum = 0;
	        for (int x : data) sum += x;
	        return sum / data.length;
	    }

	    // 기하평균
	    static double geometricMean(int[] data) {
	        double product = 1;
	        for (int x : data) product *= x;
	        return Math.pow(product, 1.0 / data.length);
	    }

	    // 조화평균
	    static double harmonicMean(int[] data) {
	        double sumOfReciprocals = 0;
	        for (int x : data) sumOfReciprocals += 1.0 / x;
	        return data.length / sumOfReciprocals;
	    }

	    // 중앙값
	    static double median(int[] data) {
	        int[] sorted = data.clone();
	        Arrays.sort(sorted);
	        int n = sorted.length;
	        if (n % 2 == 1) {
	            return sorted[n / 2];
	        } else {
	            return (sorted[n / 2 - 1] + sorted[n / 2]) / 2.0;
	        }
	    }
	}
