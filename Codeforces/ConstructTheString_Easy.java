// https://codeforces.com/problemset/problem/1335/B

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int a=input.nextInt();
            int b=input.nextInt();
            StringBuilder pattern=new StringBuilder();
            for(int j=0;j<b;j++){
                pattern.append((char)('a'+j));
            }
            StringBuilder res=new StringBuilder();
            for(int i=0;i<n;i++){
                res.append(pattern.charAt(i%b));
            }
            System.out.println(res.toString());
        }
    }
}
