package graphAlgo;

/**
 * The Floyd Warshall Algorithm is for solving the All Pairs Shortest Path problem.
 * The problem is to find shortest distances between every pair of vertices in a given edge weighted directed Graph.
 *
 * Time Complexity: O(V^3)
 */
public class FloydWarshall {

    final static int INF = 9999;
    final static int V = 4;

    void floydWarshall(int graph[][]) {

        int dist[][] = new int[V][V];
        int i, j, k;

        // Initialize the solution matrix same as input graph matrix.
        for (i=0; i<V; i++) {
            for (j=0; j<V; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        /* Add all vertices one by one to the set of intermediate
           vertices.
          ---> Before start of a iteration, we have shortest
               distances between all pairs of vertices such that
               the shortest distances consider only the vertices in
               set {0, 1, 2, .. k-1} as intermediate vertices.
          ----> After the end of a iteration, vertex no. k is added
                to the set of intermediate vertices and the set
                becomes {0, 1, 2, .. k} */
        for (k=0; k<V; k++) {
            // pick all vertices as source one by one
            for (i=0; i<V; i++) {
                // Pick all vertices as destination for the above picked source
                for (j=0; j<V; j++) {
                    // If vertex k is on the shortest path from  i to j, then update the value of dist[i][j]
                    if(dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        printSolution(dist);
    }

    void printSolution(int dist[][]) {
        System.out.println("Following matrix shows the shortest distance between every pair of vertices ");
        for (int i=0; i<V; i++) {
            for (int j=0; j<V; j++) {
                if(dist[i][j] == INF) {
                    System.out.print("INF ");
                }
                else
                    System.out.print(dist[i][j] + " \t ");
            }
            System.out.println();
        }
    }

    // Driver function
    public static void main (String args[]) {

         /* Let us create the following weighted graph
           10
        (0)------->(3)
        |         /|\
        5 |          |
        |          | 1
        \|/         |
        (1)------->(2)
           3           */

         int graph[][] = new int[][]{
                 {0,   5,  INF, 10},
                 {INF, 0,   3, INF},
                 {INF, INF, 0,   1},
                 {INF, INF, INF, 0}
                };
         FloydWarshall f = new FloydWarshall();

         f.floydWarshall(graph);
    }
}
