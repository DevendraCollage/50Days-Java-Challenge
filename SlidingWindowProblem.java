/*
 * WAP to implement a sliding window problem. You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
 * You can only see the k numbers in the window.
 * Each time the sliding window moves right by one position.
 * Input: nums = [1,3, -1, -3,5,3,6,7], k = 3 
 * 
 * Output: [3,3,5,5,6,7]
 */

import java.util.Scanner;

public class SlidingWindowProblem {
    public static void printMax(int arr[], int n, int k) {
        int j, max;
        for (int i = 0; i <= n - k; i++) {
            max = arr[i];
            for (j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
                System.out.print(max + ", ");
            }
        }
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

        System.out.print("Enter the K Value : ");
        int k = sc.nextInt();

        printMax(arr, size, k);

        sc.close();
    }
}
