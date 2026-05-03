// https://www.geeksforgeeks.org/problems/sort-by-set-bit-count1153/1

class Solution {
     public ArrayList<Integer> sortBySetBitCount(int[] arr) {
        int n = arr.length;

        Integer[] temp = new Integer[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp, (a, b) -> {
            return Integer.bitCount(b) - Integer.bitCount(a);
        });

        ArrayList<Integer> result = new ArrayList<>();
        for (int num : temp) {
            result.add(num);
        }

        return result;
    }
}
