// https://codeforces.com/problemset/problem/1866/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int x=input.nextInt();
            arr[i]=Math.abs(0-x);
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
        
        
    }
}
