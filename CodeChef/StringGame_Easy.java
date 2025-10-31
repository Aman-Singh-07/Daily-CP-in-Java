// https://www.codechef.com/problems/STRAME?tab=statement

import java.util.*;

public class Main
{
	public static void main (String[] args)
	{
		// your code goes InheritableThreadLoca
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		input.nextLine();
		while(t-->0){ 
		    int n=input.nextInt();
		    input.nextLine();
		    String s=input.nextLine();
		    int zero=0;
		    int one=0;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i)=='1') one++;
		        else zero++;
		    }
		    int min=Math.min(zero,one);
		    if(min%2==1) System.out.println("Zlatan");
		    else System.out.println("Ramos");
		}

	}
}
