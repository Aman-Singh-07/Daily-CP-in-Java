// https://codeforces.com/problemset/problem/2000/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=String.valueOf(n);
            if(s.length()<=2) System.out.println("NO");
            else{
                if(s.startsWith("10") && Integer.parseInt(s.substring(2))>=2 && s.charAt(2)!='0') System.out.println("YES");
                else System.out.println("NO"); 
            }
        }
    }
}
