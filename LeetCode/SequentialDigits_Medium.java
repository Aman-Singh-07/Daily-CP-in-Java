// https://leetcode.com/problems/sequential-digits/description/?envType=daily-question&envId=2026-07-13

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String str = "123456789";
        String l = String.valueOf(low);
        String h = String.valueOf(high);

        for (int len = l.length(); len <= h.length(); len++) {
            for (int start = 0; start <= 9 - len; start++) {
                int num = Integer.parseInt(str.substring(start, start + len));
                if (num >= low && num <= high) {
                    list.add(num);
                }
            }
        }

        return list;
    }
}
