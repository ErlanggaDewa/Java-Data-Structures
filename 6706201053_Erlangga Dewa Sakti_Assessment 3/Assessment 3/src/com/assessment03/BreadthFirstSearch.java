package com.assessment03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    HashMap<String, LinkedList<String>> adjList = new HashMap<>();
    HashMap<String, Integer> listIndex = new HashMap<>();
    private boolean[] visited;

    public BreadthFirstSearch(ArrayList<String> listCountry) {
        int index = -1;
        for (String list : listCountry) {
            LinkedList<String> listDest = new LinkedList<>();
            adjList.put(list, listDest);
            listIndex.put(list, ++index);
        }
    }

    public void addEdge(String src, String dest) {
        LinkedList<String> listDest = adjList.get(src);
        listDest.add(dest);
        adjList.put(src, listDest);
    }

    public void printBFS(String src) {
        Queue<String> queue = new LinkedList<>();
        queue.add(src);
        visited[listIndex.get(src)] = true;

        System.out.print("Urutan BFS dari vertex " + src + " adalah : ");

        while (queue.size() > 0) {
            String tempVertex = queue.poll();
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
