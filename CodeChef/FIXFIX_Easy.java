// https://www.codechef.com/problems/FIXFIX

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            int n = input.nextInt();
            int k = input.nextInt();
            if(n - k == 1 || (k == 0 && n == 1)) {
                sb.append("-1\n");
            } else {
                for(int i = 1; i <= k; i++) {
                    sb.append(i).append(" ");
                }
                for(int i = k + 2; i <= n; i++) {
                    sb.append(i).append(" ");
                }
                if(k + 1 <= n) {
                    sb.append(k + 1).append(" ");
                }
                
                sb.append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
