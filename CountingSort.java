/*
 * CountingSort Implementation in Java
 */

import java.util.*;

public class CountingSort {
    public static int[] countSort(int arr[]) {
        int N = arr.length;
        int M = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] > M) {
                M = arr[i];
            }
        }

        int countArray[] = new int[M + 1];

        for (int i = 0; i < N; i++) {
            countArray[arr[i]]++;
        }

        for (int i = 1; i <= M; i++) {
            countArray[i] = countArray[i] + countArray[i - 1];
        }

        int outputArray[] = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[arr[i]] - 1] = arr[i];
            countArray[arr[i]]--;
        }

        return outputArray;
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

        int outputArray[] = countSort(arr);

        System.out.println("Array After Sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(outputArray[i]);
        }

        sc.close();
    }
}