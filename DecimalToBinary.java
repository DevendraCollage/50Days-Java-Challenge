/*
 * WAP to convert a Decimal to Binary.
 */

import java.util.*;

public class DecimalToBinary {
    static void decimalToBinary(int num) {
        int binaryArray[] = new int[100];
        int i = 0;
        while (num > 0) {
            binaryArray[i] = num % 2;
            num = num / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryArray[j]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number here : ");
        int num = sc.nextInt();

        decimalToBinary(num);

        sc.close();
    }
}
