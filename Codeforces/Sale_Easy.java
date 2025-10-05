// https://codeforces.com/problemset/problem/34/B

import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<m;i++){
            if(arr[i]<=0) sum+=(-1)*arr[i];
        }
        System.out.println(sum);
        
    }
}
