// https://codeforces.com/problemset/problem/25/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
            if(arr[i]%2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
            
        }
        int rem=2;
        if(evenCount>oddCount){
            rem=1;
        }
        for(int i=0;i<n;i++){
            if(rem!=2){
                if(arr[i]%2!=0){
                    System.out.println(i+1);
                    break;
                }
            }
            else{
                if(arr[i]%2==0){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
