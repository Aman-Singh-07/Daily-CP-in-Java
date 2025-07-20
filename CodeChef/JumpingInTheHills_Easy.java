// https://www.codechef.com/problems/HILLS

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
            int u=input.nextInt();
            int d=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            int count=1;
            boolean parachuteUsed=false;
            for(int i=0;i<n-1;i++){
                if(arr[i+1]==arr[i]){
                    count++;
                }
                else if(arr[i+1]>arr[i]){
                    if(arr[i+1]-arr[i]<=u){
                        count++;
                    }else{
                        break;
                    }
                }
                else{ 
                    if(arr[i]-arr[i+1]<=d){
                        count++;
                    }
                    else if(!parachuteUsed){
                        parachuteUsed=true;
                        count++;
                    }else{
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}


