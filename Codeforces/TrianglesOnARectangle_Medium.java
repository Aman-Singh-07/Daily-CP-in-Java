// https://codeforces.com/contest/1620/problem/B

import java.util.*;
public class TriagnleonRectangle {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int t = fs.nextInt();
        while(t-- > 0){
            long w = fs.nextLong();
            long h = fs.nextLong();
            long area = Integer.MIN_VALUE;
            for(int i=0; i<4; i++){
                int k = fs.nextInt();
                long first=0;
                long last=0;
                for(int j=0; j<k; j++){
                    long x = fs.nextLong();
                    if(j == 0){
                        first = x;
                    }
                    if(j == k-1){
                        last = x;
                    }
                }
                long base = last-first;
                long height = 0;
                if(i<= 1){
                    height = h;
                }else{
                    height = w;
                }
                area = Math.max(area, base * height);
            }
            System.out.println(area);
        }
    }
}
