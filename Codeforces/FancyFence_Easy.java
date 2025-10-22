// https://codeforces.com/problemset/problem/270/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int res=360/(180-n);
            if(n==((res-2)*180)/res) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
