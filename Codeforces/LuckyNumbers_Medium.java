// https://codeforces.com/contest/630/problem/C

import java.util.*;
public class Main{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        long res=6;
        if(N==1)
        {
            System.out.println(2);
        }
        else if(N==2)
        {
            System.out.println(res);
        }
        else{
            long st=3;
            while(st<=N)
            {
                res+=(long)Math.pow(2,st);
                st++;
            }
            System.out.println(res);
        }
    }
}
