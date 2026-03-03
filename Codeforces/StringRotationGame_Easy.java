// https://codeforces.com/contest/2192/problem/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            int count=0;
            int res=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)!=s.charAt((i+1)%n)) count++;
                else res=1;
            }
            System.out.println(count+res);
        }
    }
}
