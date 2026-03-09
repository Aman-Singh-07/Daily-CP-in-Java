// https://codeforces.com/problemset/problem/2207/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String str=input.next();
            int countMax=0;
            int countMin=0;
            int count=0;
            char[] s=str.toCharArray();
            for(int i=1;i<n-1;i++){
                if(s[i-1]==s[i+1] && s[i-1]=='1' && s[i]!='1') s[i]='1';
                
            }
            for(char ch:s){
                if(ch=='1') countMax++;
            }
            for(int i=1;i<n-1;i++){
                if(s[i-1]==s[i+1] && s[i-1]=='1' && s[i]!='0') s[i]='0';
            }
            for(char ch:s){
                if(ch=='1') countMin++;
            }
            System.out.println((countMin)+" "+(countMax));
            
            
        }
    }
}
