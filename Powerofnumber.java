/*
 * WAP to find a power a^b (without using power and multiplication operation).
 */

import java.util.*;

public class Powerofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number here : ");
        int num = sc.nextInt();
        System.out.print("Enter the power you want of the number : ");
        int power = sc.nextInt();
        System.out.println();

        // ! Method-1
        // double pow = Math.pow(num, power);

        // ! Method-2
        double pow = 0;
        for (int i = 1; i <= power; i++) {
            pow = Math.pow(num, i);
        }

        System.out.printf("The %d Power %d is : %f", num, power, pow);

        sc.close();
    }
}
