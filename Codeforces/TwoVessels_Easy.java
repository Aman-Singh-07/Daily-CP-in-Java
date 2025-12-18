// https://codeforces.com/problemset/problem/1872/A

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            int diff=Math.abs(a-b);
            System.out.println((diff-1+2*c)/(2*c));
            
        }
    }
}
