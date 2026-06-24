
import java.util.Scanner;


public class Binary_Iterative{

    public static void binary(int[] arr,int n,int t){
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=low+(high-low)/2; //avoid overflow

            if(t==arr[mid]){
               System.out.println("target found at index:"+mid);
               return;
            }
            else if(t<arr[mid]){
                 high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("target not found");
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int t=sc.nextInt();

        binary(arr,n,t);
    }
}