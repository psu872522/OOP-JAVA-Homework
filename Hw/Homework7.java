package homework;

public class Homework7 {
    public static void main(String[] args) {
        int[] data = new int[20];

        // 랜덤 값 채우기
        for (int i = 0; i < 20; i++) {
            data[i] = (int) (Math.random() * 100);
        }

        System.out.println("정렬 전:");
        for (int i = 0; i < 20; i++) {
            System.out.println(data[i]);
        }

        // 선택 정렬 (오름차순)
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }

        System.out.println("정렬 후:");
        for (int i = 0; i < 20; i++) {
            System.out.println(data[i]);
        }
    }
}
