// https://codeforces.com/problemset/problem/1971/A

import java.util.*;
import java.math.BigInteger;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int x=input.nextInt();
            int y=input.nextInt();
            System.out.println((x>y)?y+" "+x:x+" "+y);
        }
    }
}
