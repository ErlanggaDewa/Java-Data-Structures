package com.assessment03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> vertices = new ArrayList<>();
        vertices.add("London");
        vertices.add("Salisbury");
        vertices.add("Bristol");
        vertices.add("Birmingham");
        vertices.add("Cardiff");
        vertices.add("Manchester");
        vertices.add("Kingston");
        vertices.add("Liverpool");
        vertices.add("Newcastle");
        vertices.add("Edinburgh");
        vertices.add("Glasgow");

        DepthFirstSearch dfs = new DepthFirstSearch(vertices);
        dfs.addEdge("London", "Salisbury");
        dfs.addEdge("London", "Birmingham");

        dfs.addEdge("Salisbury", "London");
        dfs.addEdge("Salisbury", "Bristol");

        dfs.addEdge("Bristol", "Salisbury");
        dfs.addEdge("Bristol", "Birmingham");

        dfs.addEdge("Birmingham", "London");
        dfs.addEdge("Birmingham", "Bristol");
        dfs.addEdge("Birmingham", "Cardiff");
        dfs.addEdge("Birmingham", "Manchester");
        dfs.addEdge("Birmingham", "Kingston");

        dfs.addEdge("Cardiff", "Birmingham");

        dfs.addEdge("Manchester", "Birmingham");
        dfs.addEdge("Manchester", "Kingston");
        dfs.addEdge("Manchester", "Liverpool");
        dfs.addEdge("Manchester", "Newcastle");
        dfs.addEdge("Manchester", "Glasgow");

        dfs.addEdge("Kingston", "Birmingham");
        dfs.addEdge("Kingston", "Manchester");
        dfs.addEdge("Kingston", "Newcastle");

        dfs.addEdge("Liverpool", "Manchester");

        dfs.addEdge("Newcastle", "Manchester");
        dfs.addEdge("Newcastle", "Kingston");
        dfs.addEdge("Newcastle", "Edinburgh");

        dfs.addEdge("Edinburgh", "Newcastle");
        dfs.addEdge("Edinburgh", "Glasgow");

        dfs.addEdge("Glasgow", "Manchester");
        dfs.addEdge("Glasgow", "Edinburgh");

        System.out.println("Urutan DFS : ");
        dfs.printDFS("London");


        BreadthFirstSearch bfs = new BreadthFirstSearch(vertices);
        bfs.addEdge("London", "Salisbury");
        bfs.addEdge("London", "Birmingham");

        bfs.addEdge("Salisbury", "London");
        bfs.addEdge("Salisbury", "Bristol");

        bfs.addEdge("Bristol", "Salisbury");
        bfs.addEdge("Bristol", "Birmingham");

        bfs.addEdge("Birmingham", "London");
        bfs.addEdge("Birmingham", "Bristol");
        bfs.addEdge("Birmingham", "Cardiff");
        bfs.addEdge("Birmingham", "Manchester");
        bfs.addEdge("Birmingham", "Kingston");

        bfs.addEdge("Cardiff", "Birmingham");

        bfs.addEdge("Manchester", "Birmingham");
        bfs.addEdge("Manchester", "Kingston");
        bfs.addEdge("Manchester", "Liverpool");
        bfs.addEdge("Manchester", "Newcastle");
        bfs.addEdge("Manchester", "Glasgow");

        bfs.addEdge("Kingston", "Birmingham");
        bfs.addEdge("Kingston", "Manchester");
        bfs.addEdge("Kingston", "Newcastle");

        bfs.addEdge("Liverpool", "Manchester");

        bfs.addEdge("Newcastle", "Manchester");
        bfs.addEdge("Newcastle", "Kingston");
        bfs.addEdge("Newcastle", "Edinburgh");

        bfs.addEdge("Edinburgh", "Newcastle");
        bfs.addEdge("Edinburgh", "Glasgow");

        bfs.addEdge("Glasgow", "Manchester");
        bfs.addEdge("Glasgow", "Edinburgh");

        System.out.println("\nUrutan BFS : ");
        bfs.printBFS("London");
    }

}