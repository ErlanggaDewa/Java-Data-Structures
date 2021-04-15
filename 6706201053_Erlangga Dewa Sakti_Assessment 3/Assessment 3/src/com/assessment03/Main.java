package com.assessment03;

public class Main {
    public static void main(String[] args) {
        AdjacencyListBFS bfsList = new AdjacencyListBFS(9);
        AdjacencyListDFS dfsList = new AdjacencyListDFS(9);

        bfsList.addEdge('A', 'B');
        bfsList.addEdge('A', 'D');
        bfsList.addEdge('A', 'E');
        bfsList.addEdge('B', 'E');
        bfsList.addEdge('C', 'B');
        bfsList.addEdge('D', 'G');
        bfsList.addEdge('E', 'F');
        bfsList.addEdge('E', 'H');
        bfsList.addEdge('F', 'C');
        bfsList.addEdge('F', 'H');
        bfsList.addEdge('G', 'H');
        bfsList.addEdge('H', 'I');
        bfsList.addEdge('I', 'F');
        bfsList.printBFS('A');

        System.out.print("\n");

        dfsList.addEdge('A', 'B');
        dfsList.addEdge('A', 'D');
        dfsList.addEdge('A', 'E');
        dfsList.addEdge('B', 'E');
        dfsList.addEdge('C', 'B');
        dfsList.addEdge('D', 'G');
        dfsList.addEdge('E', 'F');
        dfsList.addEdge('E', 'H');
        dfsList.addEdge('F', 'C');
        dfsList.addEdge('F', 'H');
        dfsList.addEdge('G', 'H');
        dfsList.addEdge('H', 'I');
        dfsList.addEdge('I', 'F');

        dfsList.printDFS('A');

    }

}