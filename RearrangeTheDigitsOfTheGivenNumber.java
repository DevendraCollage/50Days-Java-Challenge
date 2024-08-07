/*
 * You are given an integer num. Rearrange the digits of num such that its value is minimized and it does not contain any leading zeros.
 * Return the rearranged number with minimal value.
 * Note that the sign of the number does not change after rearranging the digits.
 * Input: num = 310
 * Output: 103
 * Explanation: The possible arrangements for the digits of 310 are 013, 031, 103, 130, 301, 310.
 * The arrangement with the smallest value that does not contain any leading zeros is 103.
 */

import java.util.Scanner;

public class RearrangeTheDigitsOfTheGivenNumber {
    public static int smallest(int num) {
        int freq[] = new int[10];
        boolean isPos = (num > 0);
        num = Math.abs(num);
        while (num > 0) {
            int d = num % 10;
            freq[d]++;
            num /= 10;
        }
        int result = 0;

        if (isPos) {
            for (int i = 1; i <= 9; i++) {
                if (freq[i] != 0) {
                    result = i;
                    freq[i]--;
                    break;
                }
            }

            for (int i = 9; i >= 1; i--) {
                if (freq[i] != 0) {
                    result = i;
                    freq[i]--;
                    break;
                }
            }

            for (int i = 9; i >= 0; i--) {
                while (freq[i]-- != 0) {
                    result *= 10 + i;
                }
                result = -result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number here : ");
        int num = sc.nextInt();

        System.out.println(smallest(num));

        sc.close();
    }
}