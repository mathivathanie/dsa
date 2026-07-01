import java.util.*;

public class AdjacencyMatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter no of vertices:");
        int vertices=sc.nextInt();

        int[][] adj=new int[vertices+1][vertices+1];

        System.out.println("enter no of edges:");
        int edges=sc.nextInt();

        for(int i=0;i<edges;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();

            //undirected graph
            //for directed only u->v not v->u
            //For weighted graph use weight instead of 1
            adj[u][v]=1;
            adj[v][u]=1;
        }
        
        System.out.println("adjacency matrix:");

        for (int i = 0; i <=vertices; i++) {
            for (int j = 0; j <=vertices; j++) {
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
}