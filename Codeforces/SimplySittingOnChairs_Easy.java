// https://codeforces.com/contest/2210/problem/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=input.nextInt();
            // int count=0;
            // for(int i=0;i<n-1;i++){
            //     if(arr[i]<=(i+1) || arr[i]==n) count++;
            // }
            // if(arr[n-1]==n) count++;
            // System.out.println(count);
            
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<n-1;i++){
                if(arr[i]<=(i+1) || arr[i]==n) list.add(1);
            }
            if(arr[n-1]==n) list.add(1);
            System.out.println(list.size());
        }
    }
}
