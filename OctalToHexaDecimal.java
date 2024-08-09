/*
 * WAP to convert an Octal into hexa-decimal.
 */

import java.util.Scanner;

public class OctalToHexaDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String number here : ");
        String octalNumber = sc.nextLine();

        int decimalNumber = Integer.parseInt(octalNumber, 8);

        String hexStr = Integer.toHexString(decimalNumber).toUpperCase();

        System.out.println("Octal: " + octalNumber + " = Hexadecimal: " + hexStr);

        sc.close();
    }
}
