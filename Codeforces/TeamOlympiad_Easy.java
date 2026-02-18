// https://codeforces.com/problemset/problem/490/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        ArrayList<Integer> l3=new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=input.nextInt();
            if(x==1) l1.add(i+1);
            if(x==2) l2.add(i+1);
            if(x==3) l3.add(i+1);
        }
        System.out.println(Math.min(l1.size(),Math.min(l2.size(),l3.size())));
        for(int i=0;i<Math.min(l1.size(),Math.min(l2.size(),l3.size()));i++){
            System.out.println(l1.get(i)+" "+l2.get(i)+" "+l3.get(i));
        }
    }
}
