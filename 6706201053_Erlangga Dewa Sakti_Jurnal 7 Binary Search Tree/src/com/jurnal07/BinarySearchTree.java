package com.jurnal07;

class BinarySearchTree {

    Node tree;

    BinarySearchTree() {
        tree = null;
    }

    public void insert(char key) {
        tree = insertHelper(tree, key);
    }

    private Node insertHelper(Node root, char input) {

        if (root == null) return new Node(input);
        if (input < root.key) root.left = insertHelper(root.left, input);
        else root.right = insertHelper(root.right, input);

        return root;
    }


    public void inOrder() {
        System.out.print("\nIn-Order\t: ");
        inOrderHelper(tree);
    }


    private void inOrderHelper(Node root) {
        if (root != null) {
            inOrderHelper(root.left);
            System.out.print(root.key + " ");
            inOrderHelper(root.right);
        }
    }

    public void preOrder() {
        System.out.print("\nPre-Order\t: ");
        preOrderHelper(tree);
    }

    private void preOrderHelper(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrderHelper(root.left);
            preOrderHelper(root.right);
        }
    }

    public void postOrder() {
        System.out.print("\nPost-Order\t: ");
        postOrderHelper(tree);
    }

    private void postOrderHelper(Node root) {
        if (root != null) {
            postOrderHelper(root.left);
            postOrderHelper(root.right);
            System.out.print(root.key + " ");
        }
    }

    public void search(char input) {
        if (searchHelper(tree, input) == null) System.out.println("" + input + " tidak ditemukan");
        else System.out.println("\n\n" + input + " ditemukan");
    }


    public Node searchHelper(Node tree, char input) {
        if (tree == null || tree.key == input) return tree;
        if (tree.key <= input) return searchHelper(tree.right, input);
        return searchHelper(tree.left, input);
    }

}
