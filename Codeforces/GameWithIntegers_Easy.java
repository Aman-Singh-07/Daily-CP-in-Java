// https://codeforces.com/problemset/problem/1899/A

import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            if(n%3==0) System.out.println("Second");
            else System.out.println("First");
        }
        
    }
}
