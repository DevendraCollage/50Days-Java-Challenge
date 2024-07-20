/*
 * WAP to find a total odd and total even digit of a given number.
 */

import java.util.*;

public class TotalOddAnEvenDIgitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number here : ");
        int num = sc.nextInt();

        String numStr = Integer.toString(num);

        int[] numArr = new int[numStr.length()];

        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = numStr.charAt(i) - '0'; // Convert to integer
            if (numArr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.printf("The Odd Count Of The Number is : %d\n", oddCount);
        ;
        System.out.printf("The Event Count Of The Number is : %d", evenCount);
        sc.close();
    }
}
