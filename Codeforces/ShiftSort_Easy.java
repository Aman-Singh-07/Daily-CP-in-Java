// https://codeforces.com/contest/2140/problem/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            int x=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0') x++;
            }
            int misplaced=0;
            for(int i=0;i<x;i++){
                if(s.charAt(i)=='1') misplaced++;
            }
            System.out.println(misplaced);
        }
        
    }
}
