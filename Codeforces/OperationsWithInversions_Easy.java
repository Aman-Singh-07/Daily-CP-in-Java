// https://codeforces.com/problemset/problem/2176/A

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            int count=0;
            int max=arr[0];
            for(int i=1;i<n;i++){
                if(arr[i]<max) count++;
                else max=arr[i];
            }
            System.out.println(count);
        }
    }
}
