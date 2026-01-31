import java.util.*;

public class Quicksort {

    static Scanner sc = new Scanner(System.in);

    public static int[] get_input() {
        System.out.println("enter n:");
        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.println("enter elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        return num;
    }

    public static void print(int[] num) {
        for (int x : num) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void quick_sort(int[] num, int low, int high) {
        if (low < high) {
            int pi = partition(num, low, high);
            quick_sort(num, low, pi);
            quick_sort(num, pi + 1, high);
        }
    }

    // Hoare partition
    public static int partition(int[] num, int low, int high) {
        int pivot = num[low];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (num[i] < pivot);

            do {
                j--;
            } while (num[j] > pivot);

            if (i >= j)
                return j;

            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] num = get_input();
        quick_sort(num, 0, num.length - 1);
        print(num);
    }
}

/*

1.Time complexity - O(N log N)
2.Space complexity - O(1)

STEPS:
1. Pick a pivot ( can be 1st or mid or last or random)
2. Place the pivot in the correct position
3. Put the elements < pivot to left and > pivot to right
4. Repeat the steps until array is sorted

*/