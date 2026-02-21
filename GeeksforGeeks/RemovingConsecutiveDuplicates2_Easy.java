// https://www.geeksforgeeks.org/problems/removing-consecutive-duplicates-2-1587115621/1

class Solution {
    public static String removePair(String s) {
        // code here
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(stack.isEmpty() || stack.peek()!=ch) stack.push(ch);
            else stack.pop();
        }
        char[] ch=new char[stack.size()];
        int i=ch.length-1;
        while(!stack.isEmpty()){
            ch[i--]=stack.pop();
        }
        return new String(ch);
    }
}
