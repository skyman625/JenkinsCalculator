import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator");
        Calculator calculator = new Calculator();
        System.out.println("Please enter a command");
        Scanner scanner= new Scanner(System.in);
        while(true) {
            String nextLine = scanner.nextLine();
            if (nextLine.contains("add")) {
                Scanner sc = new Scanner(nextLine.split(" ", 2)[1]);
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println(calculator.add(num1, num2));
            } else if (nextLine.contains("subtract")) {
                Scanner sc = new Scanner(nextLine.split(" ", 2)[1]);
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println(calculator.subtract(num1, num2));
            } else if (nextLine.contains("multiply")) {
                Scanner sc = new Scanner(nextLine.split(" ", 2)[1]);
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println(calculator.multiply(num1, num2));
            } else if (nextLine.contains("divide")) {
                Scanner sc = new Scanner(nextLine.split(" ", 2)[1]);
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println(calculator.divide(num1, num2));
            } else if (nextLine.contains("fibonacci")) {
                Scanner sc = new Scanner(nextLine.split(" ", 2)[1]);
                int num1 = sc.nextInt();
                System.out.println(calculator.fibonacciNumberFinder(num1));
            } else if (nextLine.contains("binary")) {
                Scanner sc = new Scanner(nextLine.split(" ", 2)[1]);
                int num1 = sc.nextInt();
                System.out.println(calculator.intToBinaryNumber(num1));
            } else {
                System.out.println("Invalid argument");
                break;
            }
        }
    }
}
