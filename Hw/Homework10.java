package homework;

import java.util.Random;

public class Homework10 {
    public static void main(String[] args) {

        int arrayCount = args.length > 0 ? Integer.parseInt(args[0]) : 100;
        int maxValue = args.length > 1 ? Integer.parseInt(args[1]) : 100;
        int binSize = args.length > 2 ? Integer.parseInt(args[2]) : 10;
        int scale = args.length > 3 ? Integer.parseInt(args[3]) : 1;

        int[] data = new int[arrayCount];
        Random rand = new Random();
        for (int i = 0; i < arrayCount; i++) {
            data[i] = rand.nextInt(maxValue); 
        }

        int binCount = maxValue / binSize;
        int[] count = new int[binCount];

        for (int value : data) {
            int binIndex = value / binSize;
            if (binIndex >= binCount) binIndex = binCount - 1; 
            count[binIndex]++;
        }

        for (int i = 0; i < binCount; i++) {
            int rangeStart = i * binSize;
            int rangeEnd = rangeStart + binSize - 1;
            System.out.printf("%d~%d\t", rangeStart, rangeEnd);

            int barLength = count[i] / scale;
            for (int j = 0; j < barLength; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
