package com.jurnal07;

public class Node {
    char key;
    Node left, right;

    public Node(char input) {
        left = right = null;
        this.key = input;
    }
}
