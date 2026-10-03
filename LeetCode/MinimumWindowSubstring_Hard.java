// https://leetcode.com/problems/minimum-window-substring/

class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int index = -1;
        
        for (int i = 0; i < t.length(); i++) {
            freq.put(t.charAt(i), freq.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        while (right < s.length()) {
            char rChar = s.charAt(right);
            
            if (freq.containsKey(rChar)) {
                freq.put(rChar, freq.get(rChar) - 1);
                if (freq.get(rChar) >= 0) {
                    count++;
                }
            } else {
                freq.put(rChar, freq.getOrDefault(rChar, 0) - 1);
            }
            right++;
            
            while (count == t.length()) {
                if (right - left < min) {
                    min = right - left;
                    index = left;
                }
                
                char lChar = s.charAt(left);
                freq.put(lChar, freq.get(lChar) + 1);
                
                if (freq.get(lChar) > 0) {
                    count--;
                }
                left++;
            }
        }
        
        if (index == -1) return "";
        return s.substring(index, index + min);
    }
}
