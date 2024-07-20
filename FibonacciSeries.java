/*
 * WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive)
 */

import java.util.*;

public class FibonacciSeries {
    // ! Recursive Approach
    public static int fibo(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number here : ");
        int n = sc.nextInt();

        // ! Iterative Approach
        // int n1 = 0;
        // int n2 = 1;
        // System.out.print(n1 + ", ");
        // System.out.print(n2 + ", ");
        // for (int i = 2; i <= n; i++) {
        // int nextTerm = n1 + n2;
        // n1 = n2;
        // n2 = nextTerm;
        // System.out.print(n2 + ", ");
        // }

        System.out.print(fibo(1) + ", ");
        System.out.print(fibo(2) + ", ");
        for (int i = 2; i <= n; i++) {
            System.out.print(fibo(i + 1) + ", ");
        }

        sc.close();
    }
}