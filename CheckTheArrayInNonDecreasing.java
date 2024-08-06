/*
 * Given an array nums with n integers, your task is to check if it could become non-decreasing
 * by modifying at most one
 * Input: nums = [4,2,3]
 * Output: true
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 */

import java.util.*;

public class CheckTheArrayInNonDecreasing {

    public static boolean checkPossibility(int arr[]) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
            if (i == 1 || arr[i] >= arr[i - 2]) {
                arr[i - 1] = arr[i];
            } else {
                arr[i] = arr[i - 1];
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        System.out.println();

        int arr[] = new int[size];

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextInt();
        }

        boolean func = checkPossibility(arr);

        System.out.println(func);

        sc.close();
    }
}
