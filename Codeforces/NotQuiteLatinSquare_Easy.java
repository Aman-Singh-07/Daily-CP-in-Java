// https://codeforces.com/problemset/problem/1915/B

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int res=-1;
            for(int i=0;i<3;i++){
                String s=input.next();
                if(!s.contains("A")) res=1;
                if(!s.contains("B")) res=2;
                if(!s.contains("C")) res=3;
            }
            if(res==1) System.out.println("A");
            else if(res==2) System.out.println("B");
            else System.out.println("C");
        }
    }
}
