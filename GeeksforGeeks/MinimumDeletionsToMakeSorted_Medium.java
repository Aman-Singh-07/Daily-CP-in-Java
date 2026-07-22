// https://www.geeksforgeeks.org/problems/minimum-number-of-deletions-to-make-a-sorted-sequence3248/1

class Solution {
    public int lcsSvc(int[] arr) {
        ArrayList<Integer> cur = new ArrayList<>();
        for (int x : arr) {
            int i = Collections.binarySearch(cur, x);
            if (i < 0) {
                i = -(i + 1);
            }
           if (i == cur.size()) {
                cur.add(x);
            } else {
                cur.set(i, x);
            }
        }
        return cur.size();
    }
    public int minDeletions(int[] arr) {
        return arr.length - lcsSvc(arr);
    }
}
