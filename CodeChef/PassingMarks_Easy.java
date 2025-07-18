// https://www.codechef.com/problems/CUTOFF?tab=statement

import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // your code goes here
            Arrays.sort(a);
            if(n==x){
		        System.out.println(a[0]-1);    
		    }else{
		        System.out.println(a[n-x]-1);
		    }
        }
    }
}
