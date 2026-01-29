import java.util.*;

public class Insertion{

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
        
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && num[j-1]>num[j]){
                 int t=num[j];
                 num[j]=num[j-1];
                 num[j-1]=t;
                 j--;
            }
        }
        //print
        print(n,num);
    }
}