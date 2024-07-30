/*
 * WAP to convert a Binary to Decimal.
 */

import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary number here : ");
        int binary = sc.nextInt();

        int dec_value = 0;
        int base = 1;
        int temp = binary;
        while (temp > 0) {
            int lastDigit = temp % 10;
            temp = temp / 10;
            dec_value = dec_value + lastDigit * base;
            base = base * 2;
        }

        System.out.println(dec_value);

        sc.close();
    }
}
