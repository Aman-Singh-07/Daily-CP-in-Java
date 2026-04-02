// https://codeforces.com/contest/2214/problem/D
 
import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
        String[] res={
                "walk",
                "no",
                "no",
                "no",
                "yes",
                "yes",
                "backwards",
                "7"
        };
        System.out.println(res[n - 1]);

	}
}
