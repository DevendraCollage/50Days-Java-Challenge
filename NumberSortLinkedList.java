/*
 * WAP to sort a number in ascending order in singly linked list.
 */

import java.util.*;

public class NumberSortLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Linked List : ");
        int size = sc.nextInt();
        System.out.println();

        List<Integer> l = new LinkedList<>();

        System.out.println("Enter the Elements of the Linked List : ");
        for (int i = 0; i < size; i++) {
            System.out.printf("[%d] : ", i);
            l.add(sc.nextInt());
        }
        System.out.println();

        System.out.println("Before Sorting : ");
        System.out.println(l);

        Collections.sort(l);

        System.out.println("After Sorting : ");
        System.out.println(l);

        sc.close();
    }
}