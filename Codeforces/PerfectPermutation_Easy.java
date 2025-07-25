//  https://codeforces.com/problemset/problem/233/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n%2!=0){
            System.out.println(-1);
            return;
        }
        int[] arr=new int[n+1];
        for(int i=1;i<=n;i+=2){
            arr[i+1]=i;
            arr[i]=i+1;
        }
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
