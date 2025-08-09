// https://codeforces.com/problemset/problem/977/C

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(input.nextInt());
        }
        Collections.sort(list);
        if(k==0){
            if(list.get(0)>1) System.out.println(list.get(0)-1);
            else System.out.println(-1);
            return;
        }
        if(k==n){
            System.out.println(list.get(n-1));
            return;
        }
        if(list.get(k-1)<list.get(k)) System.out.println(list.get(k-1));
        else System.out.println(-1);
    }
}
