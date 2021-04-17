package com.assessment03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class BreadthFirstSearch {
    HashMap<String, LinkedList<String>> adjList = new HashMap<>();
    HashMap<String, Integer> listIndex = new HashMap<>();
    LinkedList<String> queue = new LinkedList<>();
    int number = 1;
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
        visited = new boolean[adjList.size()];
        visited[listIndex.get(src)] = true;
        BFSUtil(src);
    }

    private void BFSUtil(String src) {
        System.out.println(number++ + ". " + src + " ");

        queue.addAll(adjList.get(src));

        while (!queue.isEmpty()) {
            if (!visited[listIndex.get(queue.peek())]) {
                visited[listIndex.get(queue.peek())] = true;
                BFSUtil(queue.pop());
            } else {
                queue.pop();
            }
        }
    }
}
