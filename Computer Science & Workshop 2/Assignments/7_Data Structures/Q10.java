/*Write a Java program to traverse a graph using breadth-first search (BFS) and
 *provide the final output of the code. (Use the ArrayDeque collection.)*/

 import java.util.*;

 class Graph {
     private int V; // Number of vertices
     private LinkedList<Integer>[] adjList;
 
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
 
     public void BFS(int startVertex) {
         boolean[] visited = new boolean[V];
         ArrayDeque<Integer> queue = new ArrayDeque<>();
 
         visited[startVertex] = true;
         queue.offer(startVertex);
 
         while (!queue.isEmpty()) {
             int currentVertex = queue.poll();
             System.out.print(currentVertex + " ");
 
             for (Integer neighbor : adjList[currentVertex]) {
                 if (!visited[neighbor]) {
                     visited[neighbor] = true;
                     queue.offer(neighbor);
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
 
         System.out.println("Breadth First Traversal:");
         graph.BFS(2);
     }
 }
 