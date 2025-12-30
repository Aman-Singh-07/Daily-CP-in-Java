// https://codeforces.com/problemset/problem/1385/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n=input.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<n*2;i++){
                int x=input.nextInt();
                if(!list.contains(x)){
                    list.add(x);
                }
            }
            for(int num:list){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        
    }
}
