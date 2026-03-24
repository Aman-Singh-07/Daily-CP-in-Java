// https://codeforces.com/problemset/problem/2147/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args){
	    Scanner input=new Scanner(System.in);
	    int t=input.nextInt();
	    while(t-->0){
	        int x=input.nextInt();
	        int y=input.nextInt();
	        if(x<y) System.out.println(2);
	        else if((x-y)>1 && y!=1) System.out.println(3);
	        else System.out.println(-1);
	        
	    }

	}
}
