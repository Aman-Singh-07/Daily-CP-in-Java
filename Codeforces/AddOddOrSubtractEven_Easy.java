// https://codeforces.com/problemset/problem/1311/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long a=input.nextLong();
            long b=input.nextLong();
            long diff=b-a;
            if(diff==0){
                System.out.println(0);
            }else if(diff>0){ 
                if(diff%2!=0) System.out.println(1);
                else System.out.println(2);
            }else{ 
                if(diff%2==0) System.out.println(1);
                else System.out.println(2);
            }
        }
    }
}
