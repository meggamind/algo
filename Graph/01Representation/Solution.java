import java.util.*;

class Solution {

    static class Graph {
        int V;
        List<Integer> adjListArray[];

        Graph(int V) {
            this.V = V;
            adjListArray = new LinkedList[V];
            for (int i = 0; i < V; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }

        void addEdge(int src, int dest) {
            adjListArray[src].add(dest);
            adjListArray[dest].add(src);
        }

        void print() {
            for (int i = 0; i < V; i++) {
                System.out.println(i + " -> " + adjListArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.print();
    }
}
