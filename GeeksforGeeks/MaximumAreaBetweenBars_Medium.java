// https://www.geeksforgeeks.org/problems/dam-of-candies--141631/1

class Solution {
    public int maxArea(List<Integer> height) {
        int left = 0;
        int right = height.size() - 1;
        int max = 0;
        while (left < right) {
           int width = right - left - 1;
            if (width > 0) {
                int minHeight = Math.min(height.get(left), height.get(right));
                max = Math.max(max, minHeight * width);
            }
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
