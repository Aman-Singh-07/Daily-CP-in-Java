// https://codeforces.com/contest/1849/problem/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            int[][] arr=new int[n][2];
            for(int i=0;i<n;i++){
                int x=input.nextInt();
                arr[i][0]=x%k;
		        arr[i][1]=i;
		        if (arr[i][0]==0) arr[i][0]=k;
		    }
		    Arrays.sort(arr,(a,b)->{
		        if (a[0]!=b[0])
		        return Integer.compare(b[0],a[0]);
		        return Integer.compare(a[1],b[1]);
		    });
            for(int i=0;i<n;i++){
                System.out.print((arr[i][1]+1)+" ");
            }
            System.out.println();
        }
    }
}
