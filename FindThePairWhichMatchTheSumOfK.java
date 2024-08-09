/*
 * Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
 * e.g.
 * Input:
 * N = 4, K = 6
 * arr[] = {1, 5, 7, 1}
 * Output: 2
 */

import java.util.Scanner;

public class FindThePairWhichMatchTheSumOfK {
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

        System.out.println("Enter the number sum you expected : ");
        int K = sc.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int sum = arr[i] + arr[j];
                if (sum == K) {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}
