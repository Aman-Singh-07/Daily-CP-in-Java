// https://codeforces.com/problemset/problem/456/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        boolean isTrue=false;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=input.nextInt();
            arr[i][1]=input.nextInt();
        }
        Arrays.sort(arr,Comparator.comparingInt(a->a[0]));
        for(int i=0;i<n-1;i++){
            if(arr[i][1]>arr[i+1][1]){
                isTrue=true;
                break;
            }
        }
        System.out.println((isTrue)?"Happy Alex":"Poor Alex");
    }
}
