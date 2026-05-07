// https://www.codechef.com/problems/QUIZPLAG?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        
        int t = Integer.parseInt(line.trim());
        
        while(t-- > 0){
            String[] firstLine = br.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int m = Integer.parseInt(firstLine[1]);
            int k = Integer.parseInt(firstLine[2]);
            
            int[] counts = new int[n + 1];
            
            String[] attempts = br.readLine().split("\\s+");
            for(int i = 0; i < k; i++){
                int x = Integer.parseInt(attempts[i]);
                if(x <= n) {
                    counts[x]++;
                }
            }
            
            StringBuilder sb = new StringBuilder();
            int disqualifiedCount = 0;
            StringBuilder ids = new StringBuilder();
            
            for(int i = 1; i <= n; i++){
                if(counts[i] > 1){
                    disqualifiedCount++;
                    ids.append(" ").append(i);
                }
            }
            
            sb.append(disqualifiedCount).append(ids);
            System.out.println(sb.toString());
        }
    }
}
