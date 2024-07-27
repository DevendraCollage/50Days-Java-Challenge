/*
 * WAP to sort an Array using Bucket sort.
 */

import java.util.*;

public class BucketSort {
    private static int hash(int num, int bucketSize) {
        return num / bucketSize;
    }

    private static void bucketSort(int arr[], int size) {
        @SuppressWarnings("unchecked")
        List<Integer>[] bkt = new List[size];

        for (int i = 0; i < size; i++) {
            bkt[i] = new LinkedList<>();
        }

        for (int list : arr) {
            bkt[hash(list, size)].add(list);
        }

        for (List<Integer> buckets : bkt) {
            Collections.sort(buckets);
        }

        int index = 0;

        for (List<Integer> bucket : bkt) {
            for (int num : bucket) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        System.out.println();

        int arr[] = new int[size];

        System.out.println("Enter the elements of the Array : ");
        for (int i = 0; i < size; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println();

        System.out.printf("Unsorted Array : %s", Arrays.toString(arr));

        bucketSort(arr, size);
        System.out.println();

        System.out.printf("Sorted Array : %s", Arrays.toString(arr));

        sc.close();
    }
}