/*
 * WAP to convert a Decimal number to BCD.
 */

import java.util.*;

public class DecimalToBCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number Here : ");
        int num = sc.nextInt();

        String bcd = "";
        while (num > 0) {
            int digit = num % 10;
            String binary = String.format("%4s", Integer.toBinaryString(digit)).replace(' ', '0');
            bcd = binary + bcd;
            num = num / 10;
        }

        System.out.println(bcd);

        sc.close();
    }
}
