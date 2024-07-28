/*
    *********
    **** ****
    ***   ***
    **     **
    *       *
 */

public class Pattern3 {
    public static void main(String[] args) {
        int n = 9;
        int lines = 5;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < lines - i; j++) {
                if (i == 0) {
                    for (int k = 0; k < j; k++) {
                        System.out.print("*");
                    }
                }
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            if (i > 0) {
                for (int j = 0; j < lines - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
