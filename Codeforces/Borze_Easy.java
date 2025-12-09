// https://codeforces.com/problemset/problem/32/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.next();
        while(s.contains("--")){
            s=s.replace("--","2");
        }
        while(s.contains("-.")){
            s=s.replace("-.","1");
        }
        while(s.contains(".")){
            s=s.replace(".","0");
        }
        System.out.println(s);
    }
}

