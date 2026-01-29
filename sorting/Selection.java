import java.util.*;

public class Selection{

    static Scanner sc=new Scanner(System.in);
    
    public static int[] get_input(){

        System.out.println("enter n:");
        int n=sc.nextInt();
        
        System.out.println("enter elements:");
        int[] num=new int[n];

        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        return num;
    }

    public static void print(int n,int[] num){
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
    }

    public static void main(String[] args){

        int[] num=get_input();
        int n=num.length;
        
        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i+1;j<=n-1;j++){
                if(num[j]<num[min]){
                    min=j;
                }
            }
            int t=num[i];
            num[i]=num[min];
            num[min]=t;

        }

        //print
        print(n,num);
    }
}