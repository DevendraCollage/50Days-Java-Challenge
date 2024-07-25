/*
 * WAP to sort an Array using Selection sort.
 */

import java.util.*;

public class SelectionSort {
    void sort(int arr[], int n) {
        int minj, minx, i, j;
        for (i = 0; i < n - 1; i++) {
            minj = i;
            minx = arr[i];

            for (j = i + 1; j < n; j++) {
                if (arr[j] < minx) {
                    minj = j;
                    minx = arr[j];
                }
            }

            if (minj != i) {
                arr[minj] = arr[i];
                arr[i] = minx;
            }
        }
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : %d, ", i, arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        System.out.println();

        int arr[] = new int[size];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextInt();
        }

        SelectionSort s = new SelectionSort();

        s.sort(arr, size);
        System.out.println();

        s.printArray(arr);

        sc.close();
    }
}
