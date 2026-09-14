package homework;

public class Homework4 {
    public static void main(String[] args) {
        for (int dan = 1; dan <= 9; dan++) {
            for (int i = 1; i <= 9; i++) {
                System.out.print(i + "*" + dan + "=" + (i * dan) + " ");
            }
            System.out.println();
        }
    }
}
