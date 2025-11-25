// https://codeforces.com/problemset/problem/1996/A

import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int count=n/4;  
            if(n%4!=0){ 
                count++;
            }
            System.out.println(count);
        }
    }
}
