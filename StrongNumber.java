package com.day1;
import java.util.Scanner;

public class StrongNumber {
	
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

		    public static boolean isStrongNumber(int num) {
		        int sumFactorials = 0;
		        int originalNum = num;

		        while (num != 0) {
		            int digit = num % 10;
		            sumFactorials += factorial(digit);
		            num /= 10;
		        }

		        return sumFactorials == originalNum;
		    }

		    public static int factorial(int n) {
		        int fact = 1;
		        for (int i = 1; i <= n; i++) {
		            fact *= i;
		        }
		        return fact;
		    }
		}
	
