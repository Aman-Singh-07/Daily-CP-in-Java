// https://codeforces.com/contest/1679/problem/A

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner fs = new Scanner(System.in);
        Long t = fs.nextLong();
        while( t --> 0) {
            long n = fs.nextLong();
            if( n < 4 || (n & 1) == 1){
                System.out.println("-1");
            }else{
                Long max = n / 4;
                Long min = n % 6 == 0 ? n / 6 : n / 6 + 1;
                System.out.println(min +" "+ max);
            }
        }
    }
}
