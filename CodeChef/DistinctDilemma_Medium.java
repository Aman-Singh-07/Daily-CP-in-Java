// https://www.codechef.com/problems/DISTDILEM?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int sum=0;
            int[] arr=new int[n];
            int count=0;
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                sum+=arr[i];
            }
            for(int i=1;i<=sum;i++){
                count++;
                sum-=i;
            }
            System.out.println(count);
        }
    }
}
