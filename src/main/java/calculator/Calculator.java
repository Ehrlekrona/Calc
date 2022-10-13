package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("^^^Welcome to my first java app!^^^");
        boolean continueCalculation = true;
        Scanner sc = new Scanner(System.in);

        while (continueCalculation == true) {
            char operator;
            Double number1, number2, result;

            Scanner input = new Scanner(System.in);

            System.out.println("Enter number:");
            number1 = input.nextDouble();

            System.out.println("Operator: +, -, *, or /");
            operator = input.next().charAt(0);

            System.out.println("Second number:");
            number2 = input.nextDouble();

            switch (operator) {
                case '+' -> {
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                }
                case '-' -> {
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                }
                case '*' -> {
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                }
                case '/' -> {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                }
                default -> System.out.println("Invalid!");}
            System.out.println("Do you want to continue? Answer with either Yes or No");
            String continueInput = sc.nextLine();
            if (continueInput.equals("No"))
            {
                continueCalculation = false;
            }
        }

    }

}