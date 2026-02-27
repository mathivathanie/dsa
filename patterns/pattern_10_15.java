import java.util.*;

public class Pattern_10_15{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pattern number:");
        int choice = sc.nextInt();

        System.out.println("Enter size:");
        int n = sc.nextInt();
        

        switch (choice) {

            case 10: pattern10(n); break;
            case 11: pattern11(n); break;
            case 12: pattern12(n); break;
            case 13: pattern13(n); break;
            case 14: pattern14(n); break;
            case 15: pattern15(n); break;
        
            default: System.out.println("Invalid pattern number");
        }

        
    }

    static void pattern10(int n){
        for(int i=0;i<n;i++){

           for(int j=0;j<n-i-1;j++){
              System.out.print(" ");
           }
           for(int k=0;k< i+1;k++){
              System.out.print("* ");
           }
           System.out.println();

        }
    }

    static void pattern11(int n){
        for(int i=0;i<n;i++){

           for(int j=0;j<i;j++){
              System.out.print(" ");
           }
           for(int k=0;k<n-i;k++){
              System.out.print("* ");
           }
           System.out.println();

        }
    }

    static void pattern12(int n){
        for(int i=0;i<n;i++){

           for(int j=0;j<i;j++){
              System.out.print(" ");
           }
           for(int k=0;k<n-i;k++){
              System.out.print("* ");
           }
           System.out.println();

        }

        for(int i=0;i<n;i++){

           for(int j=0;j<n-i-1;j++){
              System.out.print(" ");
           }
           for(int k=0;k< i+1;k++){
              System.out.print("* ");
           }
           System.out.println();

        }  

    }

    static void pattern13(int n){
        for(int i=0;i<n;i++){
            
            //leading space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            //first row
            if(i==0){
               System.out.print("*");
            }
            else if(i==n-1){
            //last row
            for(int j=0;j<2*n-1;j++){
                System.out.print("*");
            }        
            }
            else{
            //middle rows
            System.out.print("*");
            for(int j=0;j<2*i-1;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            }
              System.out.println();         
        }
        
    }

     static void pattern14(int n){
        for(int i=0;i<n;i++){
            
            //leading space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            //first row
            if(i==0){
               for(int j=0;j<2*n-1;j++){
                System.out.print("*");
            } 
            }
            else if(i==n-1){
            //last row
                System.out.print("*"); 
            }
            else{
            //middle rows
            System.out.print("*");
            for(int j=0;j< 2*n - 2*i -3 ;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            }
              System.out.println();         
        }
        
    }

    static void pattern15(int n){
        //1st half
        for(int i=0;i<n;i++){
            
            //leading space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            //first row
            if(i==0){
               System.out.print("*");
            }
            else{
            //middle rows
            System.out.print("*");
            for(int j=0;j<2*i-1;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            }
              System.out.println();         
        }

        //2nd half
        for(int i=1;i<n;i++){
            
            //leading space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            
            if(i==n-1){
            //first row
                System.out.print("*"); 
            }
            else{

            System.out.print("*");
            for(int j=0;j< 2*n - 2*i -3 ;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            }
              System.out.println();         
        }
        
    }
}
