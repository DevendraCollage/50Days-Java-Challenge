/*
 * WAP to find a factorial of a given integer (iterative and recursive)
 */

import java.util.*;

public class FactorialOfNumber {
    // Recursive Approach
    static int factorialOfNum(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return (n * factorialOfNum(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to find the factorial : ");
        int num = sc.nextInt();
        System.out.println();

        int fact = 1;

        // Iterative Approach
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.printf("The Factorial of the %d is : %d\n\n", num, fact);

        System.out.printf("The Factorial of the %d is = %d", num, factorialOfNum(num));

        sc.close();
    }
}
