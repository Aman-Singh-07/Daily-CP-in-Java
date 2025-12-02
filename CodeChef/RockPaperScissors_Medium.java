// https://www.codechef.com/problems/MINRPC?tab=ide

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);

        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append('P');
            }
            int res=n/2+1;
            for (int i=0;i<n;i++){
                if (s.charAt(i)=='R') {
                    res--;
                }
            }
            for(int i=n-1;i>=0;i--){
                if(res>0 && (s.charAt(i)=='P' || s.charAt(i)=='S')){
                    sb.setCharAt(i,(s.charAt(i)=='P')?'S':'R');
                    res--;
                }
            }
            System.out.println(sb);
        }
	}
}
