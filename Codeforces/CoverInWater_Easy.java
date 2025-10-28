// https://codeforces.com/problemset/problem/1900/A

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            if(s.contains("...")) System.out.println(2);
            else{
                int count=0;
                for(char ch:s.toCharArray()){
                    if(ch=='.') count++;
                }
                System.out.println(count);
            }
        }
    }
}
