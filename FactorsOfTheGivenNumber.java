/*
 * WAP to find a Factor of a given number (iterative and recursive)
 */

import java.util.*;

public class FactorsOfTheGivenNumber {
    // Recursive Approach
    static void factorsOfNumbers(int n, int i) {
        if (i <= n) {
            if (n % i == 0) {
                System.out.printf("%d, ", i);
            }
            factorsOfNumbers(n, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number Here : ");
        int num = sc.nextInt();
        System.out.println();

        // Iterative Approach
        System.out.printf("The Factors of the Given Number is : %d\n", num);
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.printf("%d, ", i);
            }
        }

        factorsOfNumbers(num, 1);

        sc.close();
    }
}