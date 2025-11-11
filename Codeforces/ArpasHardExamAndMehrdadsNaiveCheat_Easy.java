// https://codeforces.com/problemset/problem/742/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            if(n==0){
                System.out.println(1);
            }else{
                int[] cycle={6,8,4,2};
                System.out.println(cycle[n%4]);
            }
    }
}
