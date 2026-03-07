// https://codeforces.com/contest/2157/problem/B

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int x=input.nextInt();
            int y=input.nextInt();
            String s=input.next();
            int count4=0;
            int count8=0;
            for(char ch:s.toCharArray()){
                if(ch=='4') count4++;
                else count8++;
            }
            x=Math.abs(x);
            y=Math.abs(y);
            if(x>n || y>n) System.out.println("NO");
            else{
                if(x+y<=n*2-count4) System.out.println("YES");
                else System.out.println("NO");
            }
            
        }
    }
}
