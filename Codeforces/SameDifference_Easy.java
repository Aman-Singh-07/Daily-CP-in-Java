// https://codeforces.com/problemset/problem/2166/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            int count=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)==s.charAt(n-1)) count++;
            }
            System.out.println(n-count);
        }
    }
}
