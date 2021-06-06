package com.soal01;

import java.util.Arrays;

public class BinarySearchTree {
    Node tree;

    BinarySearchTree() {
        tree = null;
    }

    public void insert(String nama, String noTelepon, String noMember) {
        tree = insertHelper(tree, nama, noTelepon, noMember);
    }

    private Node insertHelper(Node root, String nama, String noTelepon, String noMember) {
//        Base Case
        if (root == null) return new Node(nama, noTelepon, noMember);
        if (nama.compareTo(root.key[0]) < 0) root.left = insertHelper(root.left, nama, noTelepon, noMember);
        else root.right = insertHelper(root.right, nama, noTelepon, noMember);

        return root;
    }


    public void inOrder() {
        System.out.println("\nIn-Order\t: ");
        inOrderHelper(tree);
    }


    private void inOrderHelper(Node root) {
        if (root != null) {
            inOrderHelper(root.left);
            System.out.println(Arrays.toString(root.key));
            inOrderHelper(root.right);
        }
    }

    void delete(String nama) {

        System.out.println("\n\nData yang dihapus : " + nama);
        tree = deleteRec(tree, nama);
    }

    Node deleteRec(Node root, String nama) {
//        Base Case
        if (root == null)
            return null;

        if (nama.compareTo(root.key[0]) < 0)
            root.left = deleteRec(root.left, nama);
        else if (nama.compareTo(root.key[0]) > 0)
            root.right = deleteRec(root.right, nama);

        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = inOrderSuccessor(root.right);

            root.right = deleteRec(root.right, root.key[0]);
        }

        return root;
    }

    String[] inOrderSuccessor(Node root) {
        String[] value = {root.key[0], root.key[1], root.key[2]};
        while (root.left != null) {
            value = root.left.key;
            root = root.left;
        }
        return value;
    }
}
