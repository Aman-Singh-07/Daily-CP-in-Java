// https://www.geeksforgeeks.org/problems/lexicographically-smallest-after-removing-k/1

class Solution {
    public String lexicographicallySmallest(String s, int k) {
        // code here
        int n=s.length();
        k=((n&(n-1))==0?k/2:k*2);
        if(k>=n || k<0) return "-1";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            while(!stack.isEmpty() && k>0 && stack.peek()>ch){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
        
    }
}
