package com.jurnal05;

import java.util.LinkedList;

public class AdjacencyList {
    int vertex;
    LinkedList<Character>[] adjList;

    public AdjacencyList(int totalVertex) {
        this.vertex = totalVertex;
        adjList = new LinkedList[totalVertex];
        for (int i = 0; i < totalVertex; i++) {
            adjList[i] = new LinkedList<Character>();
        }
    }

    public void addEdge(char src, char dest) {
        int indexSrc = (int) Character.toUpperCase(src) - 65;
        adjList[indexSrc].add(dest);
    }

    public void printGraph() {
        for (int i = 0; i < this.vertex; i++) {
            char src = Character.toUpperCase((char) (i + 65));
            if (adjList[i].size() != 0) {
                System.out.print("Vertex " + src + " is connected to : ");
                for (int j = 0; j < adjList[i].size(); j++) {
                    System.out.print(adjList[i].get(j) + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
