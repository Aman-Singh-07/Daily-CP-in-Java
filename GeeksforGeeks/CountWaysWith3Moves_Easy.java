// https://www.geeksforgeeks.org/problems/count-number-of-hops-1587115620/1?page=4&status=unsolved&sortBy=submissions

class Solution {
	
	static int countWays(int n) {
		// add your code here
		if (n <= 1)
			return 1;
		if (n == 2)
			return 2;
		
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}
		
		return dp[n];
	}
}
