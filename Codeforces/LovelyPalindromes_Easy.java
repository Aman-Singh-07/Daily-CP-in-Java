// https://codeforces.com/problemset/problem/688/B

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n=reader.readLine();
        if(n!=null){
            n=n.trim();
            StringBuilder sb=new StringBuilder(n);
            sb.append(new StringBuilder(n).reverse());
            System.out.println(sb.toString());
        }
    }
}
