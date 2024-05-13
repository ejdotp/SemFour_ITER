/* Create a class Graph with a linked list member to represent N number of
 * vertices. Implement the required constructor. Add a method to the Graph class
 * for reading a graph and storing it in an adjacency list representation.
 * Include a depth-first search (DFS) method in the Graph class to traverse the
 * vertices of the graph, and a main method to invoke all the methods.*/

 import java.util.*;

 class Graph {
     private int V; // Number of vertices
     private LinkedList<Integer>[] adjList;
 
     @SuppressWarnings("unchecked")
     public Graph(int vertices) {
         V = vertices;
         adjList = new LinkedList[V];
         for (int i = 0; i < V; ++i) {
             adjList[i] = new LinkedList<>();
         }
     }
 
     public void addEdge(int src, int dest) {
         adjList[src].add(dest);
     }
 
     public void DFSUtil(int v, boolean[] visited) {
         visited[v] = true;
         System.out.print(v + " ");
 
         for (Integer neighbor : adjList[v]) {
             if (!visited[neighbor]) {
                 DFSUtil(neighbor, visited);
             }
         }
     }
 
     public void DFS(int startVertex) {
         boolean[] visited = new boolean[V];
         DFSUtil(startVertex, visited);
     }
 
     public static void main(String[] args) {
         Graph graph = new Graph(4);
         graph.addEdge(0, 1);
         graph.addEdge(0, 2);
         graph.addEdge(1, 2);
         graph.addEdge(2, 0);
         graph.addEdge(2, 3);
         graph.addEdge(3, 3);
 
         System.out.println("Adjacency List Representation:");
         for (int i = 0; i < graph.V; ++i) {
             System.out.print(i + " -> ");
             for (Integer vertex : graph.adjList[i]) {
                 System.out.print(vertex + " ");
             }
             System.out.println();
         }
 
         System.out.println("Depth First Traversal:");
         graph.DFS(2);
     }
 }
 