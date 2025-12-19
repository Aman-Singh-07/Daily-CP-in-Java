// https://codeforces.com/problemset/problem/1858/A

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            System.out.println((a+(c+1)/2)>(b+c/2)?"First":"Second");
            
        }
    }
}
