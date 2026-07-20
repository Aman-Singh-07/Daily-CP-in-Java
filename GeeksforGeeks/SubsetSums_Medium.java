// https://www.geeksforgeeks.org/problems/subset-sums2234/1?page=4&status=unsolved&sortBy=submissions

class Solution {
	public ArrayList<Integer> subsetSums(int[] arr) {
		// code here
		ArrayList<Integer> res = new ArrayList<>();
		find(res, 0, 0, arr);
		return res;
		
	}
	void find(ArrayList<Integer> res, int sum, int idx, int [] arr) {
		res.add(sum);
		for (int i = idx; i<arr.length; i++) {
			find(res, sum + arr[i], i + 1, arr);
		}
	}
}
