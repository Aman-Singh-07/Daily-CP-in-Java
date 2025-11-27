// https://codeforces.com/problemset/problem/381/A

import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            int left=0;
            int right=n-1;
            int k=0;
            int num1=0;
            int num2=0;
            while(left<=right){
                if(k%2==0){
                    if(arr[left]>arr[right]){
                        num1+=arr[left];
                        left++;
                    }else{
                        num1+=arr[right];
                        right--;
                    }
                }
                else{
                    if(arr[left]>arr[right]){
                        num2+=arr[left];
                        left++;
                    }else{
                        num2+=arr[right];
                        right--;
                    }
                }
                k++;
            }
            System.out.println(num1+" "+num2);
    }
}
