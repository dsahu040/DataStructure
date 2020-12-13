package graphAlgo;

/**
 * A Java program for Prim's Minimum Spanning Tree (MST) algorithm.
 * The program is for adjacency matrix representation of the graph
 *
 * Greedy Algorithm
 * Time complexity : O(V^2)
 */
public class PrimMST {

    private static final int V = 5;

    // utility function to find the vertex with minimum key value, from the set of vertices not yet included in MST
    int minKey(int key[], boolean mstSet[]) {

        int min = Integer.MAX_VALUE;
        int min_Index = -1;

        for(int i=0; i<V; i++) {
            if(mstSet[i] == false && key[i] < min) {
                min = key[i];
                min_Index = i;
            }
        }
        return min_Index;
    }

    // utility function to print the constructed MST stored in parent[]
    void printMST(int parent[], int n, int graph[][]) {
        System.out.println("Edge    Weight");
        for (int i = 1; i<n; i++) {
            System.out.println(parent[i] +" - " + i + "    " + graph[i][parent[i]]);
        }
    }

    /**
     * Function to construct and print MST for a graph represented
     * using adjacency matrix representation
     */
    void primMST(int graph[][]) {

        // Array to store constructed MST
        int parent[] = new int[V];

        // Key values used to pick minimum weight edge in cut
        int key[] = new int[V];

        // To represent set of vertices not yet included in MST
        boolean mstSet[] = new boolean[V];

        // initialize all keys as INFINITE
        for (int i=0; i<V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        // Always include first 1st vertex in MST. Make key 0 so that this vertex is picked as first vertex.
        key[0] = 0;
        // First node is always root of MST
        parent[0] = -1;

        // The MST will have V vertices
        for (int count=0; count<V; count++) {
            // pick minimum key vertex, which is not yet included in MST
            int u = minKey(key, mstSet);

            // Add the picked vertex to the MST Set
            mstSet[u] = true;

            // Update key value and parent index of the adjacent
            // vertices of the picked vertex. Consider only those
            // vertices which are not yet included in MST
            for (int v=0; v<V; v++) {
                // graph[u][v] is non zero only for adjacent vertices of m
                // mstSet[v] is false for vertices not yet included in MST
                // Update the key only if graph[u][v] is smaller than key[v]
                if(graph[u][v] != 0 && mstSet[v] == false
                        && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }
        printMST(parent, V, graph);
    }

    // Driver method
    public static void main (String args[]) {

    /* Let us create the following graph
           2    3
        (0)--(1)--(2)
        |    / \   |
        6| 8/   \5 |7
        | /      \ |
        (3)-------(4)
             9          */

        PrimMST m = new PrimMST();
        int graph[][] = new int[][]{
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0},
                };

        m.primMST(graph);
    }
}
