package com.soal01;


import java.util.Scanner;

public class MembershipTelUCoffee {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        do {
            System.out.println("\n---- Masukan Data ----");
            System.out.print("Masukan Nama : ");
            String nama = scanner.next();
            System.out.print("Masukan No Telepon : ");
            String noTelepon = scanner.next();
            System.out.print("Masukan No Member : ");
            String noMember = scanner.next();

            i++;
            tree.insert(nama, noTelepon, noMember);
        } while (i <= 3);


        tree.inOrder();

        tree.delete("Erlangga");

        tree.inOrder();

    }
}
