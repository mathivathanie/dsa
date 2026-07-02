import java.util.*;

public class BFS{
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

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        //visited array
        boolean[] visited=new boolean[vertices+1];

        //queue for bfs
        Deque<Integer> q=new LinkedList<>();

        //start node=1 inside queue
        q.offer(1);
        visited[1]=true;

        while(!q.isEmpty()){
            int e=q.poll();

            System.out.println(e);

            for(int n:adj.get(e)){
                if(!visited[n]){
                    visited[n]=true;
                    q.offer(n);
                }
            }
        }

    }
}