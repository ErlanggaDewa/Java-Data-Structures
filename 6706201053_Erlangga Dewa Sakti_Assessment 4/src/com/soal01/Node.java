package com.soal01;

public class Node {
    String[] key = new String[3];
    Node left, right;

    public Node(String nama, String noTelepon, String noMember ) {
        left = right = null;
        this.key[0] = nama;
        this.key[1] = noTelepon;
        this.key[2] = noMember;
    }
}
