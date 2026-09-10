// https://www.geeksforgeeks.org/problems/possible-pairs1550/1

class Solution {
	public int pairCount(int x, int y) {
		// code here
		long z = (long) x*y;
		long i = 1;
		int count = 0;
		while (i*i<=z) {
			if (z%i==0) {
				if (gcd(z/i, i) == x) {
					if ((z/i) != i) count += 2;
					else count+=1;
				}
			}
			i++;
		}
		return count;
	}
	public long gcd(long a, long b) {
		while (b != 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
