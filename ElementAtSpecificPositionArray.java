/*
 * WAP to enter an element at specific position into array. (Do not take a new array)
 */

import java.util.*;

public class ElementAtSpecificPositionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        System.out.println();

        int arr[] = new int[size];

        System.out.println("Enter the elements of the Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println();

        System.out.print("Enter another element you want to : ");
        int newElem = sc.nextInt();

        System.out.print("Enter the position at which you want to enter : ");
        int position = sc.nextInt();

        if (position < 0 || position >= size) {
            System.out.println("Invalid position!");
            return;
        }

        for (int i = size - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position] = newElem;

        System.out.println();
        System.out.println("After Inserting Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : %d\n", i, arr[i]);
        }

        sc.close();
    }
}
