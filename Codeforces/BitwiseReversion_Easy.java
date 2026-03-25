// https://codeforces.com/problemset/problem/2153/B

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
	        int z=input.nextInt();
	        if((x & y) == (y & z) && (y & z) == (z & x)) System.out.println("YES");
	        else System.out.println("NO");
	        
	    }

	}
}
