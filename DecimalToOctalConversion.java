/*
 * WAP to Convert a Decimal to Octal and Vice versa.
 */

import java.util.Scanner;

public class DecimalToOctalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number Here : ");
        int decimal = sc.nextInt();

        int octal = 0;
        int i = 1;

        while (decimal != 0) {
            int rem = decimal % 8;
            octal += rem * i;
            i = i * 10;
            decimal /= 8;
        }

        System.out.println(octal);

        sc.close();
    }
}
