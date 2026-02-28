//  https://codeforces.com/contest/2205/problem/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            int idxN=-1;
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                if(arr[i]==n) idxN=i;
            }
            int temp=arr[0];
            arr[0]=arr[idxN];
            arr[idxN]=temp;
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
