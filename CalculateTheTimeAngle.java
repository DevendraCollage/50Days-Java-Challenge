/*
 * WAP to calculate an angle between hour and minute hand. (Hours and minutes should be taken from user).
 */

import java.util.*;

public class CalculateTheTimeAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Hour : ");
        int hour = sc.nextInt();

        // Maintain the 12-hour format
        if (hour >= 12) {
            hour -= 12;
        }

        System.out.print("Enter the Minute : ");
        int minute = sc.nextInt();

        double hourAngle = hour * 30 + (minute * 0.5);
        double minAngle = minute * 6;

        double angle = Math.abs(hourAngle - minAngle);
        double finalAngle = Math.min(angle, 360 - angle);

        System.out.println(finalAngle);

        sc.close();
    }
}
