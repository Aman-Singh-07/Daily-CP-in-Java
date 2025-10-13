// https://www.codechef.com/problems/COLOUR?tab=ide

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int x=input.nextInt();
            int y=input.nextInt();
            int z=input.nextInt();
            int color=0;
            if(x>0){
                color++;
                x--;
            }
            if(y>0){
                color++;
                y--;
            }
            if(z>0){
                color++;
                z--;
            }
		    int[] arr={x,y,z};
		    Arrays.sort(arr);
		    arr=new int[]{arr[2],arr[1],arr[0]};
		    if(arr[0]>0 && arr[1]>0){
		        arr[0]--;
		        arr[1]--;
		        color++;
		    } 
		    if(arr[0]>0 && arr[2]>0){
		        color++;
		        arr[0]--;
		        arr[2]--;
		    }
		    if(arr[1]>0 && arr[2]>0){
		        color++;
		        arr[1]--;
		        arr[2]--;
		    }
		    System.out.println(color);
		    
        }
    }
}
