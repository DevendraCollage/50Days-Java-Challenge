/*
 * WAP to add an element into already sorted singly linked list.
 */

import java.util.*;

public class AddNewElemInSortedLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the LinkedList : ");
        int size = sc.nextInt();
        System.out.println();

        List<Integer> l = new LinkedList<>();

        System.out.println("Enter the List Elements : ");
        for (int i = 0; i < size; i++) {
            System.out.printf("[%d] : ", i);
            l.add(sc.nextInt());
        }

        Collections.sort(l);

        System.out.print("Enter the new element you want to add : ");
        int elem = sc.nextInt();

        int position = 0;
        for (int i = 0; i < l.size(); i++) {
            if (elem < l.get(i)) {
                position = i;
                break;
            } else {
                position = i + 1;
            }
        }

        l.add(position, elem);

        System.out.println(l);

        sc.close();
    }
}
