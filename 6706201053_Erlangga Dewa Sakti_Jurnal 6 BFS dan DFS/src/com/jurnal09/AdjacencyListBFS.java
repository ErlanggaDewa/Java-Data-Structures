package com.jurnal09;

import java.util.LinkedList;

public class AdjacencyListBFS {
    LinkedList<Character>[] adjList;
    private boolean[] visited;

    public AdjacencyListBFS(int totalVertex) {
        adjList = new LinkedList[totalVertex];
        visited = new boolean[totalVertex];

        for (int i = 0; i < totalVertex; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(char src, char dest) {
        adjList[toIndex(src)].add(dest);
    }

    public void printBFS(char vertex) {
        LinkedList<Character> queue = new LinkedList<>();
        queue.add(vertex);
        visited[toIndex(vertex)] = true;

        System.out.print("Urutan BFS dari vertex " + vertex + " adalah : ");

        while (queue.size() > 0) {
            char tempVertex = queue.poll();
            System.out.print(tempVertex + " ");

            for (char character : adjList[toIndex(tempVertex)]) {
                if (!visited[toIndex(character)]) {
                    visited[toIndex(character)] = true;
                    queue.add(character);
                }
            }
        }
    }

    private int toIndex(char input) {
        return (int) Character.toUpperCase(input) - 65;
    }

}
