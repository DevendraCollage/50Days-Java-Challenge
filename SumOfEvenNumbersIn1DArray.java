/*
 * WAP to find a sum of even number into 1D array.
 */

import java.util.*;

public class SumOfEvenNumbersIn1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("\nEnter The Elements of the Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }

        System.out.printf("\nThe Sum of the Even Numbers of the Array is : %d", sum);

        sc.close();
    }
}