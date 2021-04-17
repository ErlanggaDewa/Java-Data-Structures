package com.assessment03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class DepthFirstSearch {
    HashMap<String, LinkedList<String>> adjList = new HashMap<>();
    HashMap<String, Integer> listIndex = new HashMap<>();
    ArrayList<String> listUrut = new ArrayList<>();
    Stack<String> stack = new Stack<>();
    boolean[] visited;

    public DepthFirstSearch(ArrayList<String> listCountry) {
        int index = -1;
        for (String list : listCountry) {
            LinkedList<String> listDest = new LinkedList<>();
            listUrut.add(list);
            adjList.put(list, listDest);
            listIndex.put(list, ++index);
        }
    }

    public void addEdge(String src, String dest) {
        LinkedList<String> listDest = adjList.get(src);
        listDest.add(dest);
        adjList.put(src, listDest);
        for(String x : listDest){
            System.out.println(x);
        }
        System.out.println();
    }

    public void printDFS() {
        visited = new boolean[adjList.size()];
        for (String src : listUrut) {
            if (!visited[listIndex.get(src)]) {
                DFSUtil(src);
            }
        }
    }

    private void DFSUtil(String src) {
        System.out.println(src + " ");
        visited[listIndex.get(src)] = true;

        LinkedList<String> list = adjList.get(src);

        for (String value : list) {
            if (!visited[listIndex.get(value)]) {
                DFSUtil(value);
            }
        }

    }
}
