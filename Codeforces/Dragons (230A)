// https://codeforces.com/problemset/problem/230/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        int n=input.nextInt();
        boolean isTrue=true;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=input.nextInt();
            arr[i][1]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j][0]>arr[j+1][0]){
                    int[] temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(s<=arr[i][0]){
                isTrue=false;
                break;
            }
            s+=arr[i][1];
        }
        System.out.println(isTrue?"YES":"NO");
    }
}
