package homework;

import java.util.Arrays;

class Numbers {
    int num[];

    Numbers(int num[]) {
        this.num = num;
    }

    double getTotal() {
        double sum = 0;
        for (int i = 0; i < num.length; i++) sum += num[i];
        return sum;
    }

    double getArithmaticMean() {
        return getTotal() / num.length;
    }

    double getHarmonicMean() {
        double sumInverse = 0;
        for (int i = 0; i < num.length; i++) sumInverse += 1.0 / num[i];
        return num.length / sumInverse;
    }

    double getGeometricMean() {
        double product = 1;
        for (int i = 0; i < num.length; i++) product *= num[i];
        return Math.pow(product, 1.0 / num.length);
    }

    int getMedian() {
        int[] sorted = num.clone();
        Arrays.sort(sorted);
        int mid = sorted.length / 2;
        if (sorted.length % 2 == 0) return (sorted[mid - 1] + sorted[mid]) / 2;
        return sorted[mid];
    }

    void sorting() {
        Arrays.sort(num);
    }

    void drawHistogram(int start, int end, int binCount) {
        int[] bins = new int[binCount];
        double binWidth = (double) (end - start) / binCount;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < start || num[i] >= end) continue;
            int idx = (int) ((num[i] - start) / binWidth);
            if (idx == binCount) idx--; // 경계값 보정
            bins[idx]++;
        }

        for (int i = 0; i < binCount; i++) {
            double rangeStart = start + i * binWidth;
            double rangeEnd = rangeStart + binWidth;
            System.out.printf("%6.1f ~ %6.1f : ", rangeStart, rangeEnd);
            for (int j = 0; j < bins[i]; j++) System.out.print("*");
            System.out.println(" (" + bins[i] + ")");
        }
    }

    void display() {
        System.out.printf("%3d :", num.length);
        for (int i = 0; i < num.length; i++)
            System.out.printf("%3d ", num[i]);
        System.out.println();
    }
}

public class Homework14 {
    public static void main(String[] args) {
        int size = 100;
        int data[] = new int[size];
        for (int i = 0; i < size; i++)
            data[i] = (int) (Math.random() * 100);

        Numbers obj = new Numbers(data);
        obj.display();
        System.out.printf("Arithmetic Mean : %5.2f\n", obj.getArithmaticMean());
        System.out.printf("Harmonic Mean : %5.2f\n", obj.getHarmonicMean());
        System.out.printf("Geometric Mean : %5.2f\n", obj.getGeometricMean());
        System.out.printf("Median : %d\n", obj.getMedian());
        obj.drawHistogram(0, 100, 10);
    }
}
