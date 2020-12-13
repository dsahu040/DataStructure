package graphAlgo;


import java.util.LinkedList;

/**
 * Java program to print BFS traversal from a given source vertex.
 * BFS(int s) traverses vertices reachable from s.
 * <p>
 * Time complexity : O(V+E)
 */
public class BreadthFirstTraversal {

    // number of vertices
    private int v;
    // Adjacency List
    private LinkedList<Integer> adj[];

    // constructor
    private BreadthFirstTraversal(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    // function to add an edge into Graph
    private void addEdge(int v, int w) {
        adj[v].add(w);
    }

    /**
     * Print BFS traversal for a given source S
     */
    private void bfs(int s) {

        // mark all vertices as not visited (set as false)
        boolean visited[] = new boolean[v];

        // create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();

        // mark current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            // dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s + " ");


            // get all adjacent vertices of the deque vertex s
            // if adjacent has not been visited, then mark it visited and enqueue it
            for (Integer n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // Driver method
    public static void main(String args[]) {
        BreadthFirstTraversal graph = new BreadthFirstTraversal(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Following is BFS " + "(Starting from vertex 2)");
        graph.bfs(2);
    }
}
