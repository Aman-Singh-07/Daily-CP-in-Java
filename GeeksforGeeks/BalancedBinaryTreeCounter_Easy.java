// https://www.geeksforgeeks.org/problems/bbt-counter4914/1

class Solution {
	public int countBT(int h) {
		// code here
		long mod=1000000007;
		long a=1;
		long b=1;
		for(int i=1;i<h;i++){
		    long c=a;
		    a=b;
		    b=b*((2*c)+b)%mod;
		}
		return (int) b;
	}
}
