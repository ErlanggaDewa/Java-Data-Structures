package com.jurnal07;

// Java program to demonstrate
// insert operation in binary
// search tree
class BinarySearchTree {

    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(char key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, char key) {

        if (root == null) return new Node(key);
        if (key < root.key) root.left = insertRec(root.left, key);
        else root.right = insertRec(root.right, key);

        return root;
    }


    void inorder() {
        System.out.print("\nIn-Order\t: ");
        inorderRec(root);
    }


    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void preOrder() {
        System.out.print("\nPre-Order\t: ");
        preOrderHelper(root);
    }

    private void preOrderHelper(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrderHelper(root.left);
            preOrderHelper(root.right);
        }
    }

    void postOrder() {
        System.out.print("\nPost-Order\t: ");
        postOrderHelper(root);
    }

    private void postOrderHelper(Node root) {
        if (root != null) {
            postOrderHelper(root.left);
            postOrderHelper(root.right);
            System.out.print(root.key + " ");
        }
    }

    public void search(char input) {
        if (searchHelper(root, input) == null) System.out.println("" + input + " tidak ditemukan");
        else System.out.println("\n\n" + input + " ditemukan");
    }


    public Node searchHelper(Node tree, char input) {
        if (tree == null || tree.key == input) return tree;
        if (tree.key < input) return searchHelper(tree.right, input);
        return searchHelper(tree.left, input);
    }

}
