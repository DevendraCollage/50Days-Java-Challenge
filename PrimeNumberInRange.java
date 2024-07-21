/*
 * WAP to find a prime number between range (range should be entered by user).
 */

import java.util.*;

public class PrimeNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Start Range : ");
        int start = sc.nextInt();
        System.out.print("Enter the End Range : ");
        int end = sc.nextInt();

        System.out.println("Print the prime number : ");
        for (int i = start; i <= end; i++) {
            int flag = 1;
            if (i == 0 || i == 1) {
                continue;
            }
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1) {
                System.out.print(i + ", ");
            }
        }

        sc.close();
    }
}
