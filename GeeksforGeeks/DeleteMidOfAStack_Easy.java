// https://www.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1

class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        solve(s,s.size(),0);
    }
    public static void solve(Stack<Integer> s,int len,int i){
        if(i==(len)/2){
            s.pop();
            return;
        }
        int top=s.pop();
        solve(s,len,i+1);
        s.push(top);
    }
}
