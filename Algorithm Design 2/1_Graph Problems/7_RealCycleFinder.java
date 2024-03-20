import java.util.Iterator;
import java.util.LinkedList;

class RealCycleFinder
{
    static class Graph
    {
        int V;
        LinkedList<Integer> adjListArray[];

        Graph(int V)
        {
            this.V = V;
            adjListArray = new LinkedList[V];
            for (int i = 0; i < V; i++)
            {
                adjListArray[i] = new LinkedList<>();
            }
        }

        void add(int src, int dest)
        {
            adjListArray[src].add(dest);
        }

        void DFSSearch(int v, boolean visited[])
        {
            visited[v] = true;
            System.out.print(v + " ");
            Iterator<Integer> i = adjListArray[v].listIterator(); //iterates through the graph 
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    DFSSearch(n, visited);
                }
            }
        }

        void DFS(int v)
        {
            boolean visited[] = new boolean[V];
            DFSSearch(v, visited);
        }

        boolean TheArc(int v, boolean[] visited, boolean[] explored)
        {
            visited[v] = true;
            explored[v] = true;

            Iterator<Integer> j = adjListArray[v].listIterator();
            while (j.hasNext()){
                int node = j.next();
                if (!visited[node]){
                    if (TheArc(node, visited, explored))
                        return true;
                } else if (explored[node])
                    return true;
            }
            explored[v] = false;
            return false;
        }

        boolean CycleHaiKyaBro(){
            boolean[] visited = new boolean[V];
            boolean[] explored = new boolean[V];

            for(int i = 0; i<V; i++){
                if(!visited[i])
                {
                    if(TheArc(i, visited, explored))
                        return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args)
    {
        Graph g = new Graph(5); //capacity
        g.add(0, 2); //directed input
        g.add(0, 1);
        g.add(1, 3);
        g.add(2, 3);
        g.add(3, 4);
        g.add(4, 1);

        System.out.println("Cycle hai kya bro? :" + g.CycleHaiKyaBro() );//true or false
    }
}