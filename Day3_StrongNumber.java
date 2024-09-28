package Day3;
import java.util.Scanner;

public class Day3_StrongNumber {

    public static int factorial(int n) {
        /**
         * Calculate the factorial of a number
         */
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int num) {
        /**
         * Check if a number is a Strong number
         */
        int sumFactorials = 0;
        int originalNum = num;
        while (num != 0) {
            int digit = num % 10;
            sumFactorials += factorial(digit);
            num /= 10;
        }
        return sumFactorials == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (isStrongNumber(num)) {
            System.out.println(num + " is a Strong number.");
        } else {
            System.out.println(num + " is not a Strong number.");
        }
    }
}