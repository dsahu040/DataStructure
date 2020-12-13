package graphAlgo;

/**
 * A Java program for Dijkstra's single source shortest path algorithm.
 * The program is for adjacency matrix representation of the graph
 * <p>
 * Using Adjacency matrix representation
 * <p>
 * Time Complexity : O(V^2)
 */
public class DijkstrasAlgo {

    static final int v = 9;

    // utility function to find the vertex with minimum distance value,
    // from the set of vertices not yet included in shortest path tree
    int minDistance(int dist[], Boolean sptSet[]) {

        // initialize min value
        int min = Integer.MAX_VALUE;
        int min_index = -1;

        for (int i = 0; i < v; i++) {
            if (sptSet[i] == false && dist[i] <= min) {
                min = dist[i];
                min_index = i;
            }
        }
        return min_index;
    }

    // utility function to print the constructed distance array
    void print(int dist[], int n) {
        System.out.println("Vertex Distance from Source : ");
        for (int i = 0; i < v; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    /**
     * Funtion that implements Dijkstra's single source shortest path
     * algorithm for a graph represented using adjacency matrix representation
     */
    void dijkstra(int graph[][], int src) {

        // output array to hold distance from src to i
        int dist[] = new int[v];

        // true if vertex i is included in shortest distance from src to i
        Boolean sptSet[] = new Boolean[v];

        // initialize all distance as INFINITE and sptSet[] as false
        for (int i = 0; i < v; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // distance of src vertex from itself is always 0
        dist[src] = 0;

        // find shortest path for all vertices
        for (int count = 0; count < v - 1; count++) {
            // Pick the minimum distance vertex from the set of vertices not yet processed.
            // u is always equal to src in first iteration.
            int u = minDistance(dist, sptSet);

            // mark the picked vertex as processed
            sptSet[u] = true;

            // update dist value of adjacent vertices of picked vertex
            for (int i = 0; i < v; i++) {

                //update dist[v] only if is not in sptSet
                if (!sptSet[i] && graph[u][i] != 0
                        && dist[u] != Integer.MAX_VALUE
                        && dist[u] + graph[u][i] < dist[i])
                    dist[i] = dist[u] + graph[u][i];
            }
        }
        print(dist, v);
    }

    // Driver method
    public static void main(String args[]) {

        int graph[][] = new int[][]{
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        DijkstrasAlgo d = new DijkstrasAlgo();
        d.dijkstra(graph, 0);
    }
}
