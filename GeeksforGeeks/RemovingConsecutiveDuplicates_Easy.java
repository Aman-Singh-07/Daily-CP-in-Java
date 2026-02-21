// https://www.geeksforgeeks.org/problems/removing-consecutive-duplicates-1587115621/1

class Solution {
    public static String removeConsecutiveDuplicates(String s) {
        // Your code here
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(stack.isEmpty() || stack.peek()!=ch){
                stack.push(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
        
    }
}
