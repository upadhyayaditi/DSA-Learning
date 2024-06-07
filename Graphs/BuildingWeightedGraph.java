package Graphs;
import java.util.*;

public class BuildingWeightedGraph {

    static class Edge {
        int src; // Source vertex of the edge
        int dest; // Destination vertex of the edge
        int wt; // Weight of the edge

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // Method to create a weighted graph
    public static void createGraph(ArrayList<Edge> graph[]) {
        // Initialize each vertex of the graph with an empty ArrayList
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // Define edges for each vertex
        // Here, each vertex and its adjacent vertices along with edge weights are added as edges
        graph[0].add(new Edge(0, 2, 2)); // Edge from vertex 0 to vertex 2 with weight 2

        graph[1].add(new Edge(1, 2, 10)); // Edge from vertex 1 to vertex 2 with weight 10
        graph[1].add(new Edge(1, 3, 0));  // Edge from vertex 1 to vertex 3 with weight 0

        graph[2].add(new Edge(2, 0, 2));  // Edge from vertex 2 to vertex 0 with weight 2
        graph[2].add(new Edge(2, 1, 10)); // Edge from vertex 2 to vertex 1 with weight 10
        graph[2].add(new Edge(2, 3, -1)); // Edge from vertex 2 to vertex 3 with weight -1

        graph[3].add(new Edge(3, 1, 0));  // Edge from vertex 3 to vertex 1 with weight 0
        graph[3].add(new Edge(3, 2, -1)); // Edge from vertex 3 to vertex 2 with weight -1
    }

    public static void main(String[] args) {
        int v = 4; // Number of vertices in the graph

        ArrayList<Edge> graph[] = new ArrayList[v]; // Array of ArrayLists to represent the graph

        createGraph(graph); // Call the method to create the graph

        // Print the adjacency list of vertex 1 along with edge weights
        for (int i = 0; i < graph[1].size(); i++) {
            Edge e = graph[1].get(i);
            System.out.print("(" + e.dest + "," + e.wt + ") "); // Print the destination vertex and weight of each edge
        }
    }
}
