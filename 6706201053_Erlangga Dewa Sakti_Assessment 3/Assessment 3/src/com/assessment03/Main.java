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
//        for (int i = 0; i < vertices.size(); i++){
//            System.out.println(vertices.get(i));
//        }
        DepthFirstSearch graph = new DepthFirstSearch(vertices);
        graph.addEdge("London", "Birmingham");
        graph.addEdge("London", "Salisbury");

        graph.addEdge("Salisbury", "London");
        graph.addEdge("Salisbury", "Bristol");

        graph.addEdge("Bristol", "Birmingham");
        graph.addEdge("Bristol", "Salisbury");

        graph.addEdge("Birmingham", "London");
        graph.addEdge("Birmingham", "Bristol");
        graph.addEdge("Birmingham", "Cardiff");

        graph.addEdge("Cardiff", "Birmingham");

        graph.addEdge("Manchester", "Birmingham");
        graph.addEdge("Manchester", "Kingston");
        graph.addEdge("Manchester", "Liverpool");
        graph.addEdge("Manchester", "Newcastle");
        graph.addEdge("Manchester", "Glasgow");

        graph.addEdge("Kingston", "Birmingham");
        graph.addEdge("Kingston", "Manchester");
        graph.addEdge("Kingston", "Newcastle");

        graph.addEdge("Liverpool", "Manchester");

        graph.addEdge("Newcastle", "Manchester");
        graph.addEdge("Newcastle", "Kingston");
        graph.addEdge("Newcastle", "Edinburgh");

        graph.addEdge("Edinburgh", "Newcastle");
        graph.addEdge("Edinburgh", "Glasgow");

        graph.addEdge("Glasgow", "Manchester");
        graph.addEdge("Glasgow", "Edinburgh");



        graph.printDFS();
    }

}