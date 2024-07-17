// WAP to find whether string is palindrome or not.

import java.util.*;

public class PalidromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String Here : ");
        String str = sc.nextLine();

        int len = str.length();
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        if (str.equals(rev)) {
            System.out.println("The String is Palindrome!");
        } else {
            System.out.println("The Given String is not Palindrome!");
        }

        sc.close();
    }
}
