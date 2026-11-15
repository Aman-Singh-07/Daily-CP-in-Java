// https://www.geeksforgeeks.org/problems/sum-of-all-sub-sequences-of-a-number3437/1

class Solution {
	public int subsequenceSum(String s) {
		// code here
		long res=0;
		long MOD=1000000007;
		long pow=1;
		for(int i=0;i<s.length()-1;i++){
			pow =(pow*2)%MOD;
		}
		for(char ch:s.toCharArray()){
			int digit=ch-'0';
			res=(res+(long)digit*pow)%MOD;
		}
		return (int) res;
	}
}
