// https://codeforces.com/problemset/problem/268/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=input.nextInt();
            arr2[i]=input.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr1[i]==arr2[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
