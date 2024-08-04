/*
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in sorted order.
 */

import java.util.*;

public class IntersectionOfTwoArray {
    public static int[] intersect(int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        List<Integer> arrayList = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                arrayList.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[arrayList.size()];
        for (int k = 0; k < result.length; k++) {
            result[k] = arrayList.get(k);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array-1 : ");
        int size1 = sc.nextInt();
        System.out.println();

        int arr1[] = new int[size1];

        System.out.println("Enter the elements of the Array-1");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("[%d] : ", i);
            arr1[i] = sc.nextInt();
        }
        System.out.println();

        System.out.print("Enter the size of the Array-1 : ");
        int size2 = sc.nextInt();
        System.out.println();

        int arr2[] = new int[size2];

        System.out.println("Enter the elements of the Array-2");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("[%d] : ", i);
            arr2[i] = sc.nextInt();
        }

        int newArr[] = intersect(arr1, arr2);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ", ");
        }

        sc.close();
    }
}