package com.jurnal09;

import java.util.LinkedList;

public class AdjacencyListBFS {
    int vertex;
    LinkedList<Character>[] adjList;
    boolean[] visited;

    public AdjacencyListBFS(int totalVertex) {
        this.vertex = totalVertex;
        adjList = new LinkedList[totalVertex];
        visited = new boolean[totalVertex];

        for (int i = 0; i < totalVertex; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(char src, char dest) {
        int indexSrc = toIndex(src);
        adjList[indexSrc].add(dest);
    }

    public void printBFS(char vertex) {
        int indexStart = toIndex(vertex);
        LinkedList<Character> queue = new LinkedList<>();


        queue.add(vertex);
        visited[indexStart] = true;

        System.out.print("Urutan BFS dari vertek " + vertex + " adalah : ");
        while (queue.size() > 0) {
            vertex = queue.poll();
            System.out.print(vertex + " ");

            for (Character character : adjList[toIndex(vertex)]) {
                int keN = toIndex(character);
                if (!visited[keN]) {
                    visited[keN] = true;
                    queue.add(toChar(keN));
                }
            }
        }
    }

    private int toIndex(char input) {
        return (int) Character.toUpperCase(input) - 65;
    }

    private char toChar(int input) {
        return Character.toUpperCase((char) (input + 65));
    }
}
