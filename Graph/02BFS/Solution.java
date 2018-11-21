import java.util.*;

class Solution {

    // Directed Graph

    static class Graph {
        int V;
        List<Integer>[] adjListArray;

        Graph(int V) {
            this.V = V;
            adjListArray = new LinkedList[V];
            for (int i = 0; i < V; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }

        void addEdge(int src, int dest) {
            adjListArray[src].add(dest);
        }

        void print() {
            for (int i = 0; i < V; i++) {
                System.out.println(i + " -> " + adjListArray[i]);
            }
        }

        void printBfs(int src) {
            boolean visited[] = new boolean[V];
            Queue<Integer> queue = new LinkedList<>();

            visited[src] = true;
            queue.add(src);

            while(queue.size() != 0) {
                src = queue.poll();
                System.out.println(src + " ");

                Iterator<Integer> i = adjListArray[src].listIterator();
                while(i.hasNext()) {
                    int n = i.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }




    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        graph.print();
        System.out.println("\nBFS:\n");
        graph.printBfs(2);
    }
}
