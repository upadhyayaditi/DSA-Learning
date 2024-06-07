package Graphs;

import java.util.*;

public class BuildingUnweightedGraph {

    static class Edge {
        int src; // Source vertex of the edge
        int dest; // Destination vertex of the edge

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Method to create an unweighted graph
    public static void createGraph(ArrayList<Edge> graph[]) {
        // Initialize each vertex of the graph with an empty ArrayList
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // Define edges for each vertex
        // Here, each vertex and its adjacent vertices are added as edges
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static void main(String[] args) {
        int v = 4; // Number of vertices in the graph

        ArrayList<Edge> graph[] = new ArrayList[v]; // Array of ArrayLists to represent the graph

        createGraph(graph); // Call the method to create the graph

        // Print the adjacency list of vertex 1
        for (int i = 0; i < graph[1].size(); i++) {
            Edge e = graph[1].get(i);
            System.out.print(e.dest + " "); // Print the destination vertex of each edge
        }
    }
}
