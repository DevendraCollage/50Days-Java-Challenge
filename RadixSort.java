/*
 * WAP to sort an Array using Radix sort.
 */

import java.util.*;

public class RadixSort {
    static int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void countSort(int arr[], int n, int exp) {
        int output[] = new int[n];
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] = count[i] + count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void radixSort(int arr[], int n) {
        int m = getMax(arr, n);

        for (int i = 1; m / i > 0; i *= 10) {
            countSort(arr, n, i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        System.out.println();

        int arr[] = new int[size];

        System.out.println("Enter the array Elements : ");
        for (int i = 0; i < size; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println();

        System.out.printf("Before Sorting : %s", Arrays.toString(arr));
        System.out.println();

        radixSort(arr, size);

        System.out.printf("After Sorting : %s", Arrays.toString(arr));

        sc.close();
    }
}
