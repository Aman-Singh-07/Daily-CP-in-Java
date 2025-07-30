// https://codeforces.com/problemset/problem/977/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String s=input.next();
        int count=0;
        char[] c=new char[2];
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            int r=0;
            for(int j=0;j<ch.length-1;j++){
                if(ch[i]==ch[j] && ch[i+1]==ch[j+1]){
                    r++;
                    if(r>count){
                        count=r;
                        c[0]=ch[i];
                        c[1]=ch[i+1];
                    }
                }
            }
        }
        System.out.println(String.valueOf(c[0])+String.valueOf(c[1]));
        
        
    }
}
