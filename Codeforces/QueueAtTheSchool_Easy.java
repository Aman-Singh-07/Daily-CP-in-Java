// https://codeforces.com/problemset/problem/266/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int t=input.nextInt();
        String s=input.next();
        char[] ch=s.toCharArray();
        while(t-->0){
            for(int i=0;i<ch.length-1;i++){
                if(ch[i]=='B' && ch[i+1]=='G'){
                    char temp=ch[i];
                    ch[i]=ch[i+1];
                    ch[i+1]=temp;
                    i++;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<ch.length;j++){
            sb.append(ch[j]);
        }
        System.out.println(sb.toString());
    }
}
