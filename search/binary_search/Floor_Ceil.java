import java.util.*;

/*
Floor and Ceil in a Sorted Array

Given a sorted array of distinct integers and a target value k, find:

1. Floor: The largest element in the array that is less than or equal to k.
2. Ceil: The smallest element in the array that is greater than or equal to k.

If either value does not exist, return -1 for that value.

Approach:
- Use Binary Search to efficiently search the sorted array.
- Maintain two variables:
  - floor: stores the best candidate ≤ k.
  - ceil: stores the best candidate ≥ k.
- If arr[mid] < k, update floor and move right.
- If arr[mid] > k, update ceil and move left.
- If arr[mid] == k, both floor and ceil are equal to k.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class Floor_Ceil {

    public int[] findFloorCeil(int[] arr, int k) {
        int floor = -1, ceil = -1;

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                floor = ceil = k;
                return new int[]{floor, ceil};
            }

            if (arr[mid] > k) {
                ceil = arr[mid];
                high = mid - 1;
            } else {
                floor = arr[mid];
                low = mid + 1;
            }
        }

        return new int[]{floor, ceil};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int t = sc.nextInt();

        Floor_Ceil obj = new Floor_Ceil();

        int[] sol = obj.findFloorCeil(arr, t);

        System.out.println(sol[0] + " " + sol[1]);
    }
}