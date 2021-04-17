package com.assessment03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class DepthFirstSearch {
    HashMap<String, LinkedList<String>> adjList = new HashMap<>();
    HashMap<String, Integer> listIndex = new HashMap<>();
    Stack<String> stack = new Stack<>();
    boolean[] visited;
    int number = 1;

    public DepthFirstSearch(ArrayList<String> listCountry) {
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

    public void printDFS(String src) {
        visited = new boolean[adjList.size()];
        visited[listIndex.get(src)] = true;
        DFSUtil(src);
    }

    private void DFSUtil(String src) {
        System.out.println(number++ + ". " + src + " ");

        for (String s : adjList.get(src)) {
            stack.push(s);
        }

        while (!stack.empty()) {
            if (!visited[listIndex.get(stack.peek())]) {
                visited[listIndex.get(stack.peek())] = true;
                DFSUtil(stack.pop());
            } else {
                stack.pop();
            }
        }

    }
}
