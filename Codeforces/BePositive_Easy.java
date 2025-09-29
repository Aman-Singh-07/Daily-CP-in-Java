// https://codeforces.com/problemset/problem/2149/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int countN=0;
            int count0=0;
            for(int i=0;i<n;i++){
                int x=input.nextInt();
                if(x==-1) countN++;
                else if(x==0) count0++;
            }
            int res=(countN%2==0)?0:2;
            res+=count0;
            System.out.println(res);
        }
    }
}
