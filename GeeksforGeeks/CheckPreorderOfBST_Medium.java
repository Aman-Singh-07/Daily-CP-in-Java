// https://www.geeksforgeeks.org/problems/preorder-traversal-and-bst4006/1

class Solution {
    public boolean canRepresentBST(List<Integer> arr) {
        // code here
        Stack<Integer> stack=new Stack<>();
        int last=Integer.MIN_VALUE;
        for(int num:arr){
            while(!stack.isEmpty() && stack.peek()<num){
                last=stack.pop();
            }
            if(last>num){
                return false;
            }
            stack.push(num);
        }
        return true;
        
    }
}
