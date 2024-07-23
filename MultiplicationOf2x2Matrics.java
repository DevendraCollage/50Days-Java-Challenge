
/*
 * WAP to find a Multiplication of 2 Matrix (dimension and value should be entered by user)
 */

import java.util.*;

public class MultiplicationOf2x2Matrics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Matrix-1 : ");
        int size1 = sc.nextInt();

        int arr[][] = new int[size1][size1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("[%d][%d] : ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.print("Enter the size of the Matrix-2 : ");
        int size2 = sc.nextInt();

        int arr2[][] = new int[size2][size2];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.printf("[%d][%d] : ", i, j);
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        int mul[][] = new int[size1][size2];

        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul.length; j++) {
                mul[i][j] = arr[i][j] * arr2[i][j];
            }
        }

        System.out.println("Multiplication of the two given Matrix is : ");
        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul.length; j++) {
                System.out.printf("[%d][%d] : %d\t", i, j, mul[i][j]);
            }
            System.out.println("\n");
        }

        sc.close();
    }
}