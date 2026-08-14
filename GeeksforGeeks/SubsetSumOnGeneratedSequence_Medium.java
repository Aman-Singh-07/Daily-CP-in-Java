// https://www.geeksforgeeks.org/problems/tricky-subset-problem1557/1

class Solution {
    public boolean isPossible(int[] arr, int s, int x) {
        if (x == 0) return true;
        ArrayList<Long> list = new ArrayList<>();
        long currentElement = s;
        long prefixSum = s;
        list.add(currentElement);
        for (int num : arr) {
            if (currentElement > x) {
                break;
            }
            currentElement = prefixSum + num;
            list.add(currentElement);
            prefixSum += currentElement;
        }
        
        for (int i = list.size() - 1; i >= 0; i--) {
            long val = list.get(i);
            if (x >= val) {
                x -= val;
            }
            if (x == 0) {
                return true;
            }
        }
        
        return false;
    }
}
