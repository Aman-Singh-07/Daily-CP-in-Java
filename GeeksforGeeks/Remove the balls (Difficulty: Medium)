// https://www.geeksforgeeks.org/problems/remove-the-balls--170647/1

import java.util.Stack;
class Solution {
    public int findLength(int[] color, int[] radius) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<color.length; i++){
            if(!stack.isEmpty() && color[stack.peek()]==color[i] && radius[stack.peek()]==radius[i]){
                stack.pop();
            }else{
                stack.push(i);
            }
        }
        return stack.size();
    }
}
