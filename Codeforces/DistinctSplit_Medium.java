// https://codeforces.com/problemset/problem/1791/D

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            int[] prefix=new int[n];
            int[] suffix=new int[n];
            HashSet<Character> set=new HashSet<>();
            for(int i=0;i<n;i++){
                set.add(s.charAt(i));
                prefix[i]=set.size();
            }
            set.clear();
            for(int i=n-1;i>=0;i--){
                set.add(s.charAt(i));
                suffix[i]=set.size();
            }
            int res=0;
            for(int i=0;i<n-1;i++){
                res=Math.max(res,prefix[i]+suffix[i+1]);
            }
            System.out.println(res);
        }
    }
}
