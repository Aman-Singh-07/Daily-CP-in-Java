// https://www.codechef.com/problems/MNMXDEL?tab=ide

import java.util.*;
import java.io.*;

class Codechef{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int q=input.nextInt();
            int[] arr=new int[n];
            long score=0;
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            for(int j=1;j<n;j++){
                score+=Math.min(arr[j],arr[j-1]);
            }
            
            for(int i=0;i<q;i++){
                int index=input.nextInt()-1;
                int x=input.nextInt();
                if(index>0) score-=Math.min(arr[index],arr[index-1]);
                if(index<n-1) score-=Math.min(arr[index],arr[index+1]);
                arr[index]=x;
                if(index>0) score+=Math.min(arr[index],arr[index-1]);
                if(index<n-1) score+=Math.min(arr[index],arr[index+1]);
                System.out.println(score);
                
            }
        }
    }
}
