//FUNDAMATTERS
// ABABA, REXI FRANZ
// ALMEDEN, LOUISE ANTONNETE
// BELEN, JOHN MICHAEL
// BOLIVAR, JOHN DANIEL
// NAVALES, KHYLYN
// TARAY, BEVERLY

import java.util.Scanner;

public class Fundamatters{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1, input2, operator;
        float num1, num2, result;

        do {
            System.out.print("Input: ");
            input1 = scanner.nextLine();

            // Check the validity of the first input
            if (!checkValidity(input1)) {
                System.out.println("Invalid! Try again!");
                continue;
            }

            num1 = Float.parseFloat(input1);

            System.out.print("Input: ");
            input2 = scanner.nextLine();

            // Check the validity of the second input
            if (!checkValidity(input2)) {
                System.out.println("Invalid! Try again!");
                continue;
            }

            num2 = Float.parseFloat(input2);

            System.out.print("Operator: ");
            operator = scanner.nextLine();

            // Check the validity of the operator
            if (!checkOperator(operator)) {
                System.out.println("Invalid! Try again!");
                continue;
            }

            switch (operator.toLowerCase()) {
                case "addition":
                    result = addition(num1, num2);
                    break;
                case "subtraction":
                    result = subtraction(num1, num2);
                    break;
                case "division":
                    result = division(num1, num2);
                    break;
                case "multiplication":
                    result = multiplication(num1, num2);
                    break;
                default:
                    System.out.println("Invalid! Try again!");
                    continue;
            }

            // Display the result
            viewOutput(num1, num2, operator, result);

            System.out.print("Continue? (y/n): ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));

        System.out.println("Thank you for using my program!");
        scanner.close();
    }

    // Method to get input and check its validity
    public static boolean checkValidity(String input) {
        try {
            Float.parseFloat(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Method to check the validity of the operator
    public static boolean checkOperator(String operator) {
        return operator.equalsIgnoreCase("addition")
                || operator.equalsIgnoreCase("subtraction")
                || operator.equalsIgnoreCase("division")
                || operator.equalsIgnoreCase("multiplication");
    }

    // Method to display the result
    public static void viewOutput(float num1, float num2, String operator, float result) {
        System.out.printf("%n%s %.2f %s %.2f = %.2f%n", operator, num1, getOperatorSymbol(operator), num2, result);
    }

    // Methods for basic arithmetic operations
    public static float addition(float x, float y) {
        return x + y;
    }

    public static float subtraction(float x, float y) {
        return x - y;
    }

    public static float division(float x, float y) {
        return x / y;
    }

    public static float multiplication(float x, float y) {
        return x * y;
    }

    // Helper method to get the corresponding operator symbol
    public static String getOperatorSymbol(String operator) {
        switch (operator.toLowerCase()) {
            case "addition":
                return "+";
            case "subtraction":
                return "-";
            case "division":
                return "/";
            case "multiplication":
                return "*";
            default:
                return "";
        }
    }
}
