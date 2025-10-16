// https://codeforces.com/problemset/problem/1462/A

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            long[] arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextLong();
            }
            int left=0;
            int right=n-1;
            while(left<=right){
                if(left!=right){
                    System.out.print(arr[left]+" ");
                    System.out.print(arr[right]+" ");
                    left++;
                    right--;
                }
                else{
                    System.out.print(arr[left]+" ");
                    left++;
                }
            }
            System.out.println();
        }
    }
}
