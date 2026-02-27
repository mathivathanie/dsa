import java.util.*;

public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pattern number:");
        int choice = sc.nextInt();

        System.out.println("Enter size:");
        int n = sc.nextInt();
        

        switch (choice) {
            case 1: pattern1(n); break;
            case 2: pattern2(n); break;
            case 3: pattern3(n); break;
            case 4: pattern4(n); break;
            case 5: pattern5(n); break;
            case 6: pattern6(n); break;
            case 7: pattern7(n); break;
            case 8: pattern8(n); break;
            case 9: pattern9(n); break;

            default: System.out.println("Invalid pattern number");
        }
    }

    // Pattern 1
    static void pattern1(int n) {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 2
    static void pattern2(int n) {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 3
    static void pattern3(int n) {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j<=n-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 4
    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // Pattern 5
    static void pattern5(int n) {
        for (int i = 0; i <=2*n; i++) {

            if(i<n){
              for(int j=0;j<=i;j++){
                System.out.print("*");
              }
            }
            else{
                for (int j = 0; j<=2*n-i ; j++) {
                System.out.print("*");
            }
            }
            System.out.println();
        }
    }

    //pattern 6
    static void pattern6(int n){
       for(int i=0;i<n;i++){

        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        for(int k=0;k<i+1;k++){
            System.out.print("*");
        } 
        System.out.println();
       }
    }

    
    //pattern 7
    static void pattern7(int n){
       for(int i=0;i<n;i++){

        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        for(int k=0;k<n-i;k++){
            System.out.print("*");
        } 
        System.out.println();
       }
    }

    // Pattern 8
    static void pattern8(int n) {
        for(int i=0;i<n;i++){
           for(int j=0;j<n-i-1;j++){
              System.out.print(" ");
           }
           for(int k=0;k<2*i+1;k++){
              System.out.print("*");
           }
           System.out.println();
        }
    }

    // Pattern 9
    static void pattern9(int n) {
        for(int i=0;i<n;i++){

           for(int k=0;k<i;k++){
              System.out.print(" ");
           }

           for(int j=0;j<2*n-(2*i+1);j++){
              System.out.print("*");
           }
           System.out.println();
        }
    }
}