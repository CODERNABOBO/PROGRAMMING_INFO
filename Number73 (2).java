import java.util.Scanner;

public class CheckPerfectNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean result = isPerfectNumber(number);

        System.out.println("Is it a perfect number? " + result);

        scanner.close();
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false; // Perfect numbers are positive integers
        }

        int sum = 0;

        // Check divisors up to the square root of the number
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        // Subtract the original number as it was added as a divisor
        sum -= number;

        // Check if the sum of divisors equals the original number
        return sum == number;
    }
}

