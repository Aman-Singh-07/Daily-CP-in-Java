// https://codeforces.com/problemset/problem/149/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[12];
        for(int i=0;i<12;i++){
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        int res=0;
        int count=0;
        for(int i=11;i>=0;i--){
            if(res>=n) break;
            count++;
            res+=arr[i];
        }
        System.out.println((res>=n)?count:-1);
    }
}
