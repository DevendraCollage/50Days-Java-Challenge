/*
 * WAP to find a summation of a digit of a given number. (Iterative and recursive)
 */

import java.util.*;

public class SumOfGivenDigit {
    // Recursive Approach
    public static int sumOfDigit(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sumOfDigit(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number here : ");
        int num = sc.nextInt();
        System.out.println();

        // Iterative Approach
        int temp = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        // System.out.printf("The Sum of the Given numbers digits is %d : %d", temp,
        // sum);

        System.out.printf("The Sum of the Given numbers digits is %d : %d", temp, sumOfDigit(num));

        sc.close();
    }
}
