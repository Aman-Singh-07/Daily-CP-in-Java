// https://codeforces.com/problemset/problem/514/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long num=input.nextLong();
        long[] arr=new long[digit(num)];
        int i=digit(num)-1;
        while(num>0){
            long r=num%10;
            if(i==0 && r==9){
                arr[i]=9;
            }else{
                arr[i]=Math.min(r,9-r);
            }
            i--;
            num/=10;
        }
        long res=0;
        for(int j=0;j<arr.length;j++){
            res=res*10+arr[j];
        }
        System.out.println(res);
    }
    public static int digit(long num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
