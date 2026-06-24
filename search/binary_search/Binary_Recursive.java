import java.util.*;

public class Binary_Recursive{

    public static void binary(int[] arr,int low,int high,int t){

       if(low>high){
         System.out.println("target not found");
         return;
       }
       
       int mid=low+(high-low)/2; //avoid overflow

       if(t==arr[mid]){
        System.out.println("Found at index:"+mid);
       }
       else if(t>arr[mid]){
        binary(arr,mid+1,high,t);
       }
       else{
         binary(arr,low,mid-1,t);
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int t=sc.nextInt();

        binary(arr,0,n-1,t);
    }
}