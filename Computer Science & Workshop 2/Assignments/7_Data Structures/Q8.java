/* Write a program to implement the graph using adjacency matrix representation
 * and adjacency list representation. Create methods to display the adjacency
 * matrix and adjacency list of the graph.*/

 import java.util.*;

class Graph {
     private int[][] adjacencyMatrix;
     private List<List<Integer>> adjacencyList;
     private int numVertices;
 
     public Graph(int numVertices) {
         this.numVertices = numVertices;
         adjacencyMatrix = new int[numVertices][numVertices];
         adjacencyList = new ArrayList<>();
         for (int i = 0; i < numVertices; i++) {
             adjacencyList.add(new ArrayList<>());
         }
     }
 
     public void addEdge(int source, int destination) {
         adjacencyMatrix[source][destination] = 1;
         adjacencyMatrix[destination][source] = 1;
 
         adjacencyList.get(source).add(destination);
         adjacencyList.get(destination).add(source);
     }
 
     public void displayAdjacencyMatrix() {
         System.out.println("Adjacency Matrix:");
         for (int i = 0; i < numVertices; i++) {
             for (int j = 0; j < numVertices; j++) {
                 System.out.print(adjacencyMatrix[i][j] + " ");
             }
             System.out.println();
         }
     }
 
     public void displayAdjacencyList() {
         System.out.println("Adjacency List:");
         for (int i = 0; i < numVertices; i++) {
             System.out.print(i + " -> ");
             for (Integer vertex : adjacencyList.get(i)) {
                 System.out.print(vertex + " ");
             }
             System.out.println();
         }
     }
 
     public static void main(String[] args) {
         int numVertices = 5;
         Graph graph = new Graph(numVertices);
 
         // Adding edges
         graph.addEdge(0, 1);
         graph.addEdge(0, 2);
         graph.addEdge(1, 2);
         graph.addEdge(1, 3);
         graph.addEdge(2, 3);
         graph.addEdge(3, 4);
 
         // Displaying adjacency matrix and adjacency list
         graph.displayAdjacencyMatrix();
         System.out.println();
         graph.displayAdjacencyList();
     }
 }
 