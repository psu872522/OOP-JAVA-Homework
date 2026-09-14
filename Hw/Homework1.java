package homework;

public class Homework1 {
	
    public static void main(String[] args) {
        int i, j;

        System.out.println();
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }

        System.out.println();
        for (i = 1; i <= 10; i++) {
            for (j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }

        System.out.println();
        for (i = 10; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }

        System.out.println();
        for (i = 10; i >= 1; i--) {
            for (j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
