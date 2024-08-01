/*
 * WAP to find a quotient and reminder of 2 number (bigger number should be divided by lower number) and you are not allowed to use a division and quotient operator.
 */

import java.util.*;

public class FindQuotientAndReminder {
    static int[] find(int dividend, int divisor, int start, int end) {
        if (start > end) {
            return new int[] { 0, dividend };
        }
        int mid = start + (end - start) / 2;
        int n = dividend - divisor * mid;
        if (n > divisor) {
            start = mid + 1;
        } else if (n < 0) {
            end = mid - 1;
        } else {
            if (n == divisor) {
                ++mid;
                n = 0;
            }

            return new int[] { mid, n };
        }

        return find(dividend, divisor, start, end);
    }

    static int[] divide(int dividend, int divisor) {
        return find(dividend, divisor, 1, dividend);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Dividend Number : ");
        int divided = sc.nextInt();
        System.out.print("Enter the Divisor Number : ");
        int divisor = sc.nextInt();

        int arr[] = divide(divided, divisor);

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        sc.close();
    }
}
