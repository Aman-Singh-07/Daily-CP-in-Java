// https://www.geeksforgeeks.org/problems/the-infinite-string1049/1

class Solution {
    public char posInfinite(String s, int pos) {
        long p = pos;
        ArrayList<Long> lengths = new ArrayList<>();
        lengths.add((long) s.length());
        int step = 0;
        while (lengths.get(step) < p) {
            step++;
            long prevLen = lengths.get(step - 1);
            lengths.add(2 * prevLen + step);
        }

        while (step > 0) {
            long prevLen = lengths.get(step - 1);
            long currLen = lengths.get(step);
            if (p <= prevLen) {
            } else if (p <= prevLen + step) {
                return '$';
            } else {
                p = currLen - p + 1;
            }
            step--;
        }
        return s.charAt((int) (p - 1));
    }
}
