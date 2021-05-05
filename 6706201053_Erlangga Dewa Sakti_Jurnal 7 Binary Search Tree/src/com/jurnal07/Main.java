package com.jurnal07;

public class Main {
    // Driver Code
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert('F');
        tree.insert('E');
        tree.insert('H');
        tree.insert('D');
        tree.insert('G');
        tree.insert('C');
        tree.insert('B');
        tree.insert('H');
        tree.insert('K');
        tree.insert('J');

        tree.inOrder();
        tree.preOrder();
        tree.postOrder();

        tree.search('K');
        tree.search('A');
    }
}
//  In-order 	= B C D E F G H H J K
//	Pre-order	= F E D C B H G H K J
//	Post-order	= B C D E G J K H H F
