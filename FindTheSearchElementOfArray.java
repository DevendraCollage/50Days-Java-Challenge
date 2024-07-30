/*
 * WAP to check weather number is present in array or not (using recursion only) and the function’s syntax is given below
 * Int isInArray(int a[],int m);
 * Where int a[] is Array of integer and m is element to be searched.
 */

import java.util.*;

public class FindTheSearchElementOfArray {
    public static int isInArray(int arr[], int m, int index) {
        if (arr.length == index) {
            return -1;
        }
        if (arr[index] == m) {
            return index;
        }
        return isInArray(arr, m, index + 1);
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

        System.out.println("Enter the Element You want to find : ");
        int elem = sc.nextInt();

        System.out.println(isInArray(arr, elem, 0));

        sc.close();
    }
}