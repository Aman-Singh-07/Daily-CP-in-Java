// https://www.codechef.com/problems/SC31?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            boolean[] res=new boolean[10];
            for(int j=0;j<n;j++){
                String s=input.next();
                for(int i=0;i<10;i++){
                    if(s.charAt(i)=='1'){
                        if(res[i]==false) res[i]=true;
                        else res[i]=false;
                    }
                }
            }

            int count=0;
            for(int i=0;i<10;i++){
                if(res[i]) count++;
            }

            System.out.println(count);
        }
    }
}
