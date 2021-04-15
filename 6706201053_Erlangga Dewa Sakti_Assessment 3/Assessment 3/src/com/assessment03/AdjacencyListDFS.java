package com.assessment03;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class AdjacencyListDFS {
    LinkedList<Character>[] adjList;
    Stack<Character> stack = new Stack<>();
    private boolean[] visited;

    public AdjacencyListDFS(int totalVertex) {
        adjList = new LinkedList[totalVertex];
        visited = new boolean[totalVertex];

        for (int i = 0; i < totalVertex; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(char src, char dest) {
        adjList[toIndex(src)].add(dest);
    }

    public void printDFS(char vertex) {
        System.out.print("Urutan DFS dari vertek " + vertex + " adalah : ");

        DFSUtil(vertex);
    }

    private void DFSUtil(char vertex) {
        int index = toIndex(vertex);
        ListIterator<Character> cursorIterator = adjList[index].listIterator();

        System.out.print(vertex + " ");

        while (cursorIterator.hasNext()) {
            stack.push(cursorIterator.next());
        }

        while (!stack.empty()) {
            if (!visited[toIndex(stack.peek())]) {
                visited[toIndex(stack.peek())] = true;
                DFSUtil(stack.pop());
            } else {
                stack.pop();
            }
        }
    }


    private int toIndex(char input) {
        return (int) Character.toUpperCase(input) - 65;
    }

}
