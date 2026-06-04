// https://codeforces.com/problemset/problem/550/A

import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		String s = input.next();
		
		int firstAB = s.indexOf("AB");
		boolean case1 = (firstAB != -1) && (s.indexOf("BA", firstAB + 2) != -1);
		
		int firstBA = s.indexOf("BA");
		boolean case2 = (firstBA != -1) && (s.indexOf("AB", firstBA + 2) != -1);
		
		if (case1 || case2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
