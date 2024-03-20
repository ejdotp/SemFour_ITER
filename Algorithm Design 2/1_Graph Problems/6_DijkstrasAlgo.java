import java.util.*;

class DijkstrasAlgo {
    static final int INF = Integer.MAX_VALUE;

    int minDistance(int dist[], boolean sptSet[], int V) {
        int min = INF, min_index = -1;

        for (int v = 0; v < V; v++) {
            if (!sptSet[v] && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
        }

        return min_index;
    }

    void printSolution(int dist[], int V) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + "\t\t" + dist[i]);
    }

    void dijkstra(int graph[][], int src) {
        int V = graph.length;
        int dist[] = new int[V];
        boolean sptSet[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            dist[i] = INF;
            sptSet[i] = false;
        }
        dist[src] = 0;
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, sptSet, V);
            sptSet[u] = true;
            for (int v = 0; v < V; v++) {
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != INF && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        printSolution(dist, V);
    }

    public static void main(String[] args) {
        int V = 5;
        int graph[][] = new int[][]{
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}
        };
        int src = 0;

        DijkstrasAlgo t = new DijkstrasAlgo();
        t.dijkstra(graph, src);
    }
}