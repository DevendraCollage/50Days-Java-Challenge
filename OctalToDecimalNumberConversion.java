/*
 * Octal to Decimal Number Conversion.
 */

import java.util.Scanner;

public class OctalToDecimalNumberConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the octal Number : ");
        int octal = sc.nextInt();

        int decimal = 0;
        int i = 0;

        while (octal != 0) {
            decimal += (octal % 10) * Math.pow(8, i);
            ++i;
            octal /= 10;
        }

        System.out.println(decimal);

        sc.close();
    }
}
