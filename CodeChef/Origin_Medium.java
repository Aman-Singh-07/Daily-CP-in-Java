// https://www.codechef.com/problems/OG

import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while (t-->0){
            long n=input.nextLong();
            long cycles=n/9;
            long rem=n%9;
            long sum=cycles*45+(rem*(rem+1))/2;
            System.out.println(sum);
        }
    }
}
