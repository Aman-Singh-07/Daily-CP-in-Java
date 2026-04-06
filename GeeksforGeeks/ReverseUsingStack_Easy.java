// https://www.geeksforgeeks.org/problems/reverse-a-string-using-stack/1?page=9&status=unsolved&sortBy=submissions

class Solution {
    public String reverse(String S) {
        // code here
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(char ch:S.toCharArray()){
            stack.push(ch);
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
