// https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/?envType=daily-question&envId=2026-09-27

public class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') l1.add(i);
            if(s.charAt(i) == ')') l2.add(i);
        }        
        for(int i = l1.size() - 1; i >= 0; i--){
            int start = l1.get(i) + 1;   
            int endIdx = 0;
            for(int j = 0; j < l2.size(); j++) {
                if(l2.get(j) >= start) {
                    endIdx = j;
                    break;
                }
            }
            int end = l2.get(endIdx);
            l2.remove(endIdx);
            String target = sb.substring(start, end);
            String reversed = new StringBuilder(target).reverse().toString();
            sb.replace(start, end, reversed);
        }
        String res = sb.toString();
        res = res.replace("(", "").replace(")", "");
        return res;
    }
}
