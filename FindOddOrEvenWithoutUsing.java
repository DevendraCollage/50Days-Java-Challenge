/*
 * WAP to find whether a number is Odd or Even without using a % operator.
 */

import java.util.*;

public class FindOddOrEvenWithoutUsing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number here : ");
        int num = sc.nextInt();

        if (num / 2 * 2 == num) {
            System.out.printf("The Given Number %d is Even Number!", num);
        } else {
            System.out.printf("The Given Number %d is Odd Number!", num);
        }

        sc.close();
    }
}