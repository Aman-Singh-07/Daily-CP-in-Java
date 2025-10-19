// https://codeforces.com/problemset/problem/1971/C

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            int d=input.nextInt();
            if((a<c && a<d && ((b>c && b<d) || (b>d && b<c))) || (b<c && b<d && ((a>c && a<d) || (a>d && a<c))))
                System.out.println("YES");
            else if((c<a && c<b && ((d>a && d<b) || (d>b && d<a))) || (d<a && d<b && ((c>a && c<b) || (c>b && c<a))))
                System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
