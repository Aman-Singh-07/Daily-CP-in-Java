// https://codeforces.com/problemset/problem/2163/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            Arrays.sort(arr);
            boolean isTrue=true;
            for(int i=1;i<n-1;i+=2){
                if(arr[i]!=arr[i+1]){
                    isTrue=false;
                    break;
                }            
            }
            if(isTrue) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
