// https://www.geeksforgeeks.org/problems/squares-in-reactangle3340/1

class Solution {
	public int minSquares(int n, int m) {
		// code here
		int count = 0;
		while(m > 0 && n > 0){
			if(n>m){
				int temp=n;
				n=m;
				m=temp;
			}
			count+=m/n;
			m%=n;
		}
		return count;
	}
}
