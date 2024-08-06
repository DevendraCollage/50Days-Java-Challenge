/*
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */

import java.util.*;

public class RotateArrayKtimes {
    public static void rotate(int arr[], int n, int k) {
        k = k % n;

        System.out.println("Array After Rotate : ");
        for (int i = 0; i < n; i++) {
            if (i < k) {
                System.out.print(arr[n + i - k] + ", ");
            } else {
                System.out.print(arr[i - k] + ", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        System.out.println();

        int arr[] = new int[size];

        System.out.println("Enter the Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println();

        System.out.print("Enter the steps you want to rotate : ");
        int r = sc.nextInt();
        System.out.println();

        rotate(arr, size, r);

        sc.close();
    }
}