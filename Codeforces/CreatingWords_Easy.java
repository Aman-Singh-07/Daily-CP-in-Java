// https://codeforces.com/problemset/problem/1985/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String a=input.next();
            String b=input.next();
            System.out.println(b.charAt(0)+a.substring(1)+" "+a.charAt(0)+b.substring(1));
            
        }
    }
}
