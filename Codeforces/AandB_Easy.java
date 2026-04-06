// https://codeforces.com/contest/2149/problem/D

import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            ArrayList<Integer> l1=new ArrayList<>();
            ArrayList<Integer> l2=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='a'){
                    l1.add(i);
                }
                else{
                    l2.add(i);
                }
            }
            long lA=cost(l1);
            long lB=cost(l2);
            System.out.println(Math.min(lA, lB));
        }
    }
    
    static long cost(ArrayList<Integer> pos) {
        int k=pos.size();
        if(k<=1){
            return 0;
        }
        int mid=k/2;
        int median=pos.get(mid);
        long res=0;
        for(int i=0;i<k;i++){
            res+=Math.abs(pos.get(i)-(median-(mid-i)));
        }
        return res;
    }
}
