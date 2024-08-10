/*
 * WAP to convert a hex-decimal to Octal.
 */

import java.util.Scanner;

public class ConvertHexToOctalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Hex String Here : ");
        String hex = sc.nextLine();

        int octalNumber = Integer.parseInt(hex, 16);

        String octalStr = Integer.toOctalString(octalNumber).toUpperCase();

        System.out.println("Hexadecimal: " + hex + " = Octal: " + octalStr);

        sc.close();
    }
}