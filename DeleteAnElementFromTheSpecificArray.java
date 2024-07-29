/*
 * WAP to delete an element from array specified by user. if element is not found print a message Element is not found (do not take a new array).
 */

import java.util.*;

public class DeleteAnElementFromTheSpecificArray {
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

        System.out.print("Enter the element you want to remove : ");
        int elem = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                found = true;
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                break;
            }
        }

        if (!found) {
            System.out.println("Element is not found!");
        } else {
            System.out.println("After removing element the array is : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("[%d] : %d\n", i, arr[i]);
            }
        }

        sc.close();
    }
}
