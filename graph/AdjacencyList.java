import java.util.*;

public class AdjacencyList{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter no of vertices:");
        int vertices=sc.nextInt();

        List<ArrayList<Integer>> adj=new ArrayList<>();
        
        //create a new arraylist for each vertex
        for (int i = 0; i <=vertices; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("enter no of edges:");
        int edges=sc.nextInt();
        
        for(int i=0;i<edges;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();

            //undirected graph
            //for directed only u->v not v->u
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        System.out.println("adjacency List:");

        for (int i = 1; i <= vertices; i++) {
            System.out.print(i + " -> ");

            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }

            System.out.println();
        }

    }
}