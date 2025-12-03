// https://codeforces.com/problemset/problem/706/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr); 
        int q = input.nextInt();
        for (int i = 0; i < q; i++) {
            int m = input.nextInt();
            int res = find(arr, m);
            System.out.println(res);
        }
    }
    public static int find(int[] arr, int key) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low; 
    }
}
