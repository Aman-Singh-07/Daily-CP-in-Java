// https://www.codechef.com/problems/CODETOWN

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    String s1=input.next();
		    String vowels=new String("AEIOU");
		    boolean isTrue=false;
		    if (vowels.contains(String.valueOf(s1.charAt(1))) &&
                vowels.contains(String.valueOf(s1.charAt(3))) &&
                vowels.contains(String.valueOf(s1.charAt(5))) &&
                !vowels.contains(String.valueOf(s1.charAt(0))) &&
                !vowels.contains(String.valueOf(s1.charAt(2))) &&
                !vowels.contains(String.valueOf(s1.charAt(4))) &&
                !vowels.contains(String.valueOf(s1.charAt(6))) &&
                !vowels.contains(String.valueOf(s1.charAt(7)))) {
                isTrue = true;
            }
		    System.out.println(isTrue?"YES":"NO");
		}

	}
}
