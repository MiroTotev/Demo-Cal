import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        System.out.println("Въведете първото число:");
        num1 = scanner.nextDouble();
        System.out.println("Въведете второто число:");
        num2 = scanner.nextDouble();

        System.out.println("Изберете операция: +, -, *, или /");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: division by zero ");
                    return;
                }
                break;
            default:
                System.out.println("Error: invalid operation ");
                return;
        }

        System.out.println("Резултатът е: " + result);
        System.out.println("new add ");
        System.out.println("  ");
    
    }
}
