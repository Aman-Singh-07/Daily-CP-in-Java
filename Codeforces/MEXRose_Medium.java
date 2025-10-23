// https://codeforces.com/contest/2149/problem/C

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0)
        {
            int n=input.nextInt();
            int k=input.nextInt();
            int[] freq=new int[n+1];
            for(int i=0;i<n;i++)
            {
                int x=input.nextInt();
                freq[x]++;
            }
            int res=0;
            for(int i=0;i<k;i++)
            {
                if(freq[i]==0)
                {
                    if(freq[k]>0)
                    {
                        freq[k]--;
                    }
                    res++;
                }
            }
            res+=freq[k];
            System.out.println(res);
        }
        
    }
}
