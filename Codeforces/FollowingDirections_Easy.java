// https://codeforces.com/problemset/problem/1791/B

import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            int x=0;
            int y=0;
            boolean passed=false;
            for(int i=0;i<n;i++){
                char move=s.charAt(i);
                if(move=='L'){
                    x--;
                } else if (move == 'R') {
                    x++;
                } else if (move == 'U') {
                    y++;
                } else if (move == 'D') {
                    y--;
                }
                if (x == 1 && y == 1) {
                    passed = true;
                    break;
                }
            }
            if (passed) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
