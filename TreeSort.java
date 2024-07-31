/*
 * TreeSort Implementation in Java
 */

import java.util.*;

public class TreeSort {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    TreeSort() {
        root = null;
    }

    void insert(int key) {
        root = insertNode(root, key);
    }

    Node insertNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertNode(root.left, key);

        } else if (key > root.key) {
            root.right = insertNode(root.right, key);
        }

        return root;
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    void treeIns(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        System.out.println();

        int arr[] = new int[size];

        System.out.println("Enter the Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println();

        TreeSort ts = new TreeSort();
        ts.treeIns(arr);
        ts.inorderRec(ts.root);
        sc.close();
    }
}
