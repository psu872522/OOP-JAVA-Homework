package homework;

import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			    String inputString = scanner.nextLine();
			    if (inputString.equals("exit")) break;


			    String[] tokens = inputString.split(" ");
			    double result = Double.parseDouble(tokens[0]);


			    for (int i = 1; i < tokens.length; i += 2) {
			        String op = tokens[i];
			        double num = Double.parseDouble(tokens[i + 1]);


			        switch (op) {
			            case "+":
			                result += num;
			                break;
			            case "-":
			                result -= num;
			                break;
			            case "/":
			                result /= num;
			                break;
			            case "#": // 곱셈
			                result *= num;
			                break;
			            default:
			                System.out.println("알 수 없는 연산자: " + op);
			        }
			    }
			    System.out.println(inputString + " = " + result);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
