import java.util.*;

public class DFS{

    public static void dfs(List<ArrayList<Integer>> adj,boolean[] visited,List<Integer> ans,int node){
       ans.add(node);
       visited[node]=true;

       for(Integer i:adj.get(node)){
          if(!visited[i]){
            dfs(adj,visited,ans,i);
          }
       }
    }
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

        //recursion for dfs which implicitly do stack 
        
        List<Integer> ans=new ArrayList<>();
        dfs(adj,visited,ans,1);
        
        for(Integer i:ans){
            System.out.println(i+" ");
        }
    }
}