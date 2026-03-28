// https://codeforces.com/contest/2192/problem/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            List<Integer> ones=new ArrayList<>();
            List<Integer> zeros=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1') ones.add(i+1);
                else zeros.add(i+1);
            }
            if(ones.size()%2==0){
                System.out.println(ones.size());
                for(int x:ones) System.out.print(x+" ");
                System.out.println();
            } 
            else if(zeros.size()%2==1){
                System.out.println(zeros.size());
                for(int x:zeros) System.out.print(x+" ");
                System.out.println();
            } 
            else {
                System.out.println(-1);
            }
        }
    }
}
