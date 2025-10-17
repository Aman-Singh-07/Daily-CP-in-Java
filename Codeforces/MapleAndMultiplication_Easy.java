// https://codeforces.com/problemset/problem/2139/A

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int x=input.nextInt();
            int y=input.nextInt();
            if(x==y) System.out.println(0);
            else if(x%y==0 || y%x==0) System.out.println(1);
            else System.out.println(2);
        }
    }
}
