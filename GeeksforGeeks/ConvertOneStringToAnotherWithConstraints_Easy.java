// https://www.geeksforgeeks.org/problems/check-if-it-is-possible-to-convert-one-string-into-another-with-given-constraints4116/1

class Solution {
	public boolean isItPossible(String s1, String s2) {
		// code here
		int n = s1.length();
		if (n != s2.length())
			return false;
		
		int i = 0, j = 0;
		while (i < n || j < n) {
			while (i < n && s1.charAt(i) == '#')
				i++;
			while (j < n && s2.charAt(j) == '#')
				j++;
			
			if (i == n || j == n)
				return i == n && j == n;
			if (s1.charAt(i) != s2.charAt(j))
				return false;
			if (s1.charAt(i) == 'A' && i < j)
				return false;
			if (s1.charAt(i) == 'B' && i > j)
				return false;
			
			i++;
			j++;
		}
		return true;
	}
}
