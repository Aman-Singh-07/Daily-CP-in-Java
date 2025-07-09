// https://codeforces.com/problemset/problem/451/B


import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        int[] sorted=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
            sorted[i]=arr[i];
        }
        Arrays.sort(sorted);
        int l=0,r=n-1;
        while(l<n && arr[l]==sorted[l]) l++;

        while(r>=0 && arr[r]==sorted[r]) r--;

        if(l>=r){
            System.out.println("yes");
            System.out.println("1 1");
        }else{
            reverse(arr,l,r);
            if(Arrays.equals(arr,sorted)){
                System.out.println("yes");
                System.out.println((l+1)+" " +(r+1));
            }else{
                System.out.println("no");
            }
        }
    }
    public static void reverse(int[] arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}
