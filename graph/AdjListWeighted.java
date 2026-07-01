import java.util.*;

class Pair{
    int vertex;
    int weight;

    Pair(int vertex,int weight){
        this.vertex=vertex;
        this.weight=weight;
    }
}
public class AdjListWeighted{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter no of vertices:");
        int vertices=sc.nextInt();

        List<ArrayList<Pair>> adj=new ArrayList<>();
        
        //create a new arraylist for each vertex
        for (int i = 0; i <=vertices; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("enter no of edges:");
        int edges=sc.nextInt();
        
        for(int i=0;i<edges;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();

            //undirected graph
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }
        
        System.out.println("adjacency List:");

        for (int i = 1; i <= vertices; i++) {
            System.out.print(i + " -> ");

            for (Pair p : adj.get(i)) {
                System.out.print("(" + p.vertex + ", " + p.weight + ") ");
            }

            System.out.println();
        }

    }
}