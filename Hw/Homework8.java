package homework;

public class Homework8 {
    public static void main(String[] args) {
        int students = 30; // 학생 수
        int subjects = 4; // 국어, 영어, 수학, 과학
        int[][] score = new int[students][subjects + 1]; // 마지막 칸은 합계용

        for (int i = 0; i < students; i++) {
            int sum = 0;
            for (int j = 0; j < subjects; j++) {
                score[i][j] = (int) (Math.random() * 101); // 0~100
                sum += score[i][j];
            }
            score[i][subjects] = sum;
        }

        for (int i = 0; i < students; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < subjects; j++) {
                System.out.print(score[i][j] + " ");
            }
            System.out.println("sum=" + score[i][subjects]);
        }
    }
}                         
