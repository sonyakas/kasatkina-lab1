package ru.krista.exeple;
import java.util.Scanner;

public class Calculator {

    public void readInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите выражение: ");
        int firstN = scanner.nextInt();
        String operation = scanner.next().trim();
        int secondN = scanner.nextInt();

        int result = calculateResult(firstN, secondN, operation);
        printResult(result);
    }


    public int calculateResult(int firstN, int secondN, String operation) {
        switch (operation) {
            case "+":
                return add(firstN, secondN);
            case "-":
                return subtract(firstN, secondN);
            case "*":
                return multiply(firstN, secondN);
            case "/":
                return divide(firstN, secondN);
            default:
                throw new IllegalArgumentException("Неподдерживаемая операция");
        }
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return a / b;
    }

   
    public void printResult(int result) {
        System.out.println("Результат: " + result);
    }

}
