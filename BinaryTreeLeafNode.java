/*
 * Print a Leaf Nodes in Binary search tree.
 */

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeLeafNode {
    Node root;

    public static void printLeaf(Node node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.println(node.data);
            return;
        }
        printLeaf(node.left);
        printLeaf(node.right);
    }

    public static void main(String[] args) {
        BinaryTreeLeafNode btn = new BinaryTreeLeafNode();
        btn.root = new Node(1);
        btn.root.left = new Node(2);
        btn.root.right = new Node(3);
        btn.root.left.left = new Node(4);
        btn.root.right.right = new Node(5);

        System.out.println("Leaf nodes of the binary tree are : ");
        printLeaf(btn.root);
    }
}
