/*
 * WAP to Convert a Decimal to Hexa-decimal.
 */

import java.util.Scanner;

public class DecimalToHexdecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Decimal Number : ");
        int decimal = sc.nextInt();

        String hex = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Decimal : " + decimal + " Hexa-Decimal : " + hex);

        sc.close();
    }
}
