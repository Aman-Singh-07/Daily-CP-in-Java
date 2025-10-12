// https://www.codechef.com/problems/MTYFRI?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            ArrayList<Integer> motu=new ArrayList<>();
            ArrayList<Integer> tomu=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(i%2==0) motu.add(arr[i]);
                else tomu.add(arr[i]);
            }
            motu.sort(Collections.reverseOrder());
            Collections.sort(tomu);
            int swaps=Math.min(k,Math.min(motu.size(),tomu.size()));
            for(int i=0;i<swaps;i++){
                if (motu.get(i)>tomu.get(i)){
                    int temp=motu.get(i);
                    motu.set(i,tomu.get(i));
                    tomu.set(i,temp);
                }else{
                    break;
                }
            }
            int sumMotu=0,sumTomu=0;
            for(int x:motu) sumMotu+=x;
            for(int x:tomu) sumTomu+=x;
            if(sumTomu>sumMotu) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
