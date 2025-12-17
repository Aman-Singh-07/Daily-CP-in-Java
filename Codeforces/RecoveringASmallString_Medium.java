// https://codeforces.com/problemset/problem/1931/A

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s="";
            for(int i=1;i<=26;i++){
                for(int j=1;j<=26;j++){
                int k=n-i-j;
                if(k>=1 && k<=26){
                    char c1=(char) ('a'+i-1);
                    char c2=(char) ('a'+j-1);
                    char c3=(char) ('a'+k-1);
                    s=""+c2+c3+c1;
                    break;
                }
            }
            }
            System.out.println(s);
        }
    }
}
