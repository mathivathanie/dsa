
import java.util.Scanner;

/* arr[i]>=target
smallest index*/

public class Upper_Bound{

    public static void binary(int[] arr,int n,int t){
        int low=0;
        int high=n-1;

        int ans=n;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]>t){
               ans=mid;
               high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);
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