// https://codeforces.com/problemset/problem/1857/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            int evenSum=0;
            int oddSum=0;
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                if(arr[i]%2==0){
                    evenSum+=arr[i];
                }
                else{
                    oddSum+=arr[i];
                }
            }
            if(n==2){
                if((arr[0]%2==0 && arr[1]%2==0) || (arr[0]%2!=0 && arr[1]%2!=0)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                if((evenSum%2==0 && oddSum%2==0) || (evenSum%2!=0 && oddSum%2!=0)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            
        }
    }
}
