package com.jurnal07;

// Java program to demonstrate
// insert operation in binary
// search tree
class BinarySearchTree {

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(char key) {
        root = insertRec(root, key);
    }

    /* A recursive function to
    insert a new key in BST */
    Node insertRec(Node root, char key) {

		/* If the tree is empty,
		return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key) root.left = insertRec(root.left, key);
        else root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder() {
        System.out.print("\nIn-Order\t: ");
        inorderRec(root);
    }

    // A utility function to
    // do inorder traversal of BST
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void preorder() {
        System.out.print("\nPre-Order\t: ");
        preorderRec(root);
    }

    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void postorder() {
        System.out.print("\nPost-Order\t: ");
        postorderRec(root);
    }

    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }
    /* Class containing left
    and right child of current node
    * and key value*/
    static class Node {
        char key;
        Node left, right;

        public Node(char item) {
            key = item;
            left = right = null;
        }
    }
}
// This code is contributed by Ankur Narain Verma
