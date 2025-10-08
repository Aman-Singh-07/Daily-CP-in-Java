// https://codeforces.com/problemset/problem/2145/A

import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            if(n%3==0) System.out.println(0);
            else{
                int temp=((n/3)+1)*3;
                System.out.println(temp-n);
            }
        }
    }
}
