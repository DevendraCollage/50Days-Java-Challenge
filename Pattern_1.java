/*
 * Print a following pattern
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 */

import java.util.*;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of iteration here : ");
        int itr = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= itr; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
