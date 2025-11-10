// https://codeforces.com/problemset/problem/1353/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                a[i]=input.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=input.nextInt();
            }
            Arrays.sort(b);
            Arrays.sort(a);
            int j=n-1;
            for(int i=0;i<k;i++){
                if(a[i]<b[j]){
                    int temp=a[i];
                    a[i]=b[j];
                    b[j]=temp;
                    j--;
                }
            }
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=a[i];
            }
            System.out.println(sum);
        }
    }
}
