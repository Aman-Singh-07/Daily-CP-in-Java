// https://codeforces.com/problemset/problem/732/A

import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int count=1;
        while(count*n%10!=0 && count*n%10!=k){
            count++;
        }
        System.out.println(count);
    }
}
