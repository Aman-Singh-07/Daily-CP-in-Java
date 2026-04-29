// https://codeforces.com/contest/2226/problem/A

import java.util.Scanner;

public class Main
{
    public static void main(String[] str)
    {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        int INF=676767677;
        while((t--)!=0)
        {
            int n=input.nextInt(),sum=0;
            int a[]=new int[105];
            for(int i=1;i<=n;i++)
            {
                a[i]=input.nextInt();
                if(a[i]>1||i==n) sum+=a[i];
                sum%=INF;
            }
            System.out.println(sum);
        }
    }
}
