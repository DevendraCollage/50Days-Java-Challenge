/*
 * WAP to find weather given number is Armstrong number is not.
 */

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number here : ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, digits);
            // sum = (int) (sum + Math.pow(lastDigit, digits));
            num = num / 10;
        }

        if (sum == temp) {
            System.err.printf("The %d Number is Armstrong Numbers!\n", temp);
        } else {
            System.err.printf("The %d Number is Not Armstrong Numbers!\n", temp);
        }

        sc.close();
    }
}