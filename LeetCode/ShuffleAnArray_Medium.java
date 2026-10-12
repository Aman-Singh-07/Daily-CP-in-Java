// https://leetcode.com/problems/shuffle-an-array/description/

class Solution {
    public int[] nums;
    public Random random;

    public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
    }
    
    public int[] reset() {
        return nums;
        
    }
    
    public int[] shuffle() {
        if(nums == null) return null;
        int[] arr = nums.clone();
        for(int j = 1; j < arr.length; j++) {
            int i = random.nextInt(j + 1);
            swap(arr, i, j);
        }
        return arr;
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
