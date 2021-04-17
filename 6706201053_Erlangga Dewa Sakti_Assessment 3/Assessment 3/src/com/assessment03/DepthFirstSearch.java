package com.assessment03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class DepthFirstSearch {
    HashMap<String, LinkedList<String>> adjList = new HashMap<>();
    HashMap<String, Integer> listIndex = new HashMap<>();
    boolean[] visited;

    public DepthFirstSearch(ArrayList<String> listCountry) {
        int index = -1;
        for (String list : listCountry) {
            LinkedList<String> listDest = new LinkedList<>();
            adjList.put(list, listDest);
            listIndex.put(list, ++index);
//            System.out.println(list);
//            System.out.println(adjList.entrySet());
//            System.out.println(listIndex.entrySet());
        }
    }

    public void addEdge(String src, String dest) {
        LinkedList<String> listDest = adjList.get(src);
        listDest.addFirst(dest);
        adjList.put(src, listDest);
    }

    public void printDFS() {
        visited = new boolean[adjList.size()];
        for (Map.Entry<String, LinkedList<String>> entry : adjList.entrySet()) {
            String src = entry.getKey();
            if (!visited[listIndex.get(src)]) {
                DFSUtil(src);
            }
        }
    }

    private void DFSUtil(String src) {
//        System.out.println(src + " ");
        visited[listIndex.get(src)] = true;

        LinkedList<String> list = adjList.get(src);

        for (String value : list) {
            if (!visited[listIndex.get(value)]) {
                DFSUtil(value);
            }
        }

    }
}
