// https://codeforces.com/problemset/problem/1095/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String s=input.next();
        StringBuilder sb=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            i+=j;
            j++;
        }
        System.out.println(sb.toString());
        
    }
}
