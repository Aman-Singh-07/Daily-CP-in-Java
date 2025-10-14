// https://www.codechef.com/problems/TREATS?tab=ide

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
            int m=input.nextInt();
            long[] arr1=new long[n];
            long[] arr2=new long[n];
            for(int i=0;i<n;i++){
                arr1[i]=input.nextLong();
            }
            for(int j=0;j<n;j++){
                arr2[j]=input.nextLong();
            }
            long[] freq1=new long[m];
            long[] freq2=new long[m];

            for(int i=0;i<n;i++){
                freq1[(int)(arr1[i]%m)]++;
            }
            for(int j=0;j<n;j++){
                freq2[(int)(arr2[j]%m)]++;
            }

            long count=0;
            count+=freq1[0]*freq2[0];
            for(int r=1;r<m;r++){
                int complement=(m-r)% m;
                count+=freq1[r]*freq2[complement];
            }

            System.out.println(count);
        }
    }
}
