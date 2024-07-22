/*
 * WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value should be taken from user (Note that you are not allowed to use an array for this)
 */

import java.util.*;

public class FindTheAverage_Min_MaxWithoutUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter the size of the Array : ");
        int Size = sc.nextInt();

        for (int i = 0; i < Size; i++) {
            System.out.printf("[%d] : ", i);
            arr.add(sc.nextInt());
        }

        // ! Find Max
        int max = arr.get(0);
        for (int i = 0; i < Size; i++) {
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
        }
        System.out.printf("\nThe Max Element in the Array is : %d", max);

        // ! Find Min
        int min = arr.get(0);
        for (int i = 0; i < Size; i++) {
            if (max > arr.get(i)) {
                max = arr.get(i);
            }
        }
        System.out.printf("\nThe Min Element in the Array is : %d", min);

        // ! Find Average
        int sum = 0;
        for (int i = 0; i < Size; i++) {
            sum = sum + arr.get(i);
        }
        int average = sum / Size;
        System.out.printf("\nThe Average of the Elements is : %d", average);

        sc.close();
    }
}
