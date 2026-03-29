// https://codeforces.com/contest/2211/problem/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=input.nextInt();
            if(n==1) System.out.println(1);
            else{
                for(int i=0;i<n;i++){
                    System.out.print(2+" ");
                }
                System.out.println();
            }
        }
    }
}
