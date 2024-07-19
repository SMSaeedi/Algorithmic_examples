package algorithm.examples;

import java.util.*;

public class DijkastraAlgorithm {
    public static void main(String[] args) {
        int vertices = 6;
        Graph graph = new Graph(vertices);

        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 4, 3);
        graph.addEdge(1, 2, 2);
        graph.addEdge(1, 4, 4);
        graph.addEdge(2, 3, 9);
        graph.addEdge(3, 2, 7);
        graph.addEdge(4, 1, 1);
        graph.addEdge(4, 2, 8);
        graph.addEdge(4, 3, 2);

        graph.dijkstra();
    }
}

class Graph {
    private int vertices;
    private LinkedList<Edge>[] adjacencyList;

    static class Edge {
        int target;
        int weight;

        Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int target, int weight) {
        Edge edge = new Edge(target, weight);
        adjacencyList[source].add(edge);
    }

    void dijkstra() {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(vertices, Comparator.comparingInt(node -> node.distance));
        int[] distances = new int[vertices];
        boolean[] shortestPathTreeSet = new boolean[vertices];

        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[0] = 0;

        priorityQueue.add(new Node(0, 0));

        while (!priorityQueue.isEmpty()) {
            Node currentNode = priorityQueue.poll();
            int u = currentNode.node;

            if (shortestPathTreeSet[u]) continue;
            shortestPathTreeSet[u] = true;

            for (Edge edge : adjacencyList[u]) {
                int v = edge.target;
                int weight = edge.weight;

                if (!shortestPathTreeSet[v] && distances[u] + weight < distances[v]) {
                    distances[v] = distances[u] + weight;
                    priorityQueue.add(new Node(v, distances[v]));
                }
            }
        }

        printSolution(distances);
    }

    void printSolution(int[] distances) {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < distances.length; i++) {
            System.out.println(i + " \t\t " + distances[i]);
        }
    }

    static class Node {
        int node;
        int distance;

        Node(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }
}