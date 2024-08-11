/*
 * WAP to Convert Hexa-Decimal to Decimal.
 */

import java.util.Scanner;

public class HexaDecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Hexa-Decimal Number : ");
        String hex = sc.next();

        int decimal = Integer.parseInt(hex, 16);

        System.out.println("Hexa-Decimal : " + hex + " Decimal : " + decimal);

        sc.close();
    }
}
