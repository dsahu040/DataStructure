package graphAlgo;

import java.util.LinkedList;

/**
 * Java program to print DFS traversal from a given given graph
 * <p>
 * Time Complexity : O(V+E)
 */
public class DepthFirstTraversal {

    // number of vertices
    int v;
    //  adjacency list
    LinkedList<Integer> adj[];

    // constructor
    private DepthFirstTraversal(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    private void addEdge(int v, int w) {
        adj[v].add(w);
    }

    /**
     * A function used by Depth First Search
     */
    private void dfsUtil(int v, boolean visited[]) {
        // mark current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // recur for all the vertices adjacent to this vertex
        for (Integer n : adj[v]) {
            if (!visited[n]) {
                dfsUtil(n, visited);
            }
        }
    }

    /**
     * The function to do DFS traversal. It uses recursive DFSUtil()
     */
    private void dfs() {
        boolean visited[] = new boolean[v];

        // Call the recursive helper function to print DFS traversal starting from all vertices one by one
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                dfsUtil(i, visited);
            }
        }

    }

    // Driver function
    public static void main(String args[]) {
        DepthFirstTraversal graph = new DepthFirstTraversal(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2, 3);
        graph.addEdge(3,3);

        System.out.println("Following is Depth First Traversal ");
        graph.dfs();
    }
}
