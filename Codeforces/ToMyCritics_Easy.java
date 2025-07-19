// https://codeforces.com/problemset/problem/1850/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            if((a+b)>=10 || (b+c)>=10 || (a+c)>=10){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
    }
}
