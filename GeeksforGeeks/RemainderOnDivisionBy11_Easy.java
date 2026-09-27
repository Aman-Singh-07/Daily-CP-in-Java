// https://www.geeksforgeeks.org/problems/remainder-on-dividing-by-11--170647/1

class Solution {
	public int remainder(String s) {
		// code here
		int rem=0;
		for(char ch:s.toCharArray()){
			rem=(rem*10+(ch-'0'))%11;
		}
		return rem;
	}
};
