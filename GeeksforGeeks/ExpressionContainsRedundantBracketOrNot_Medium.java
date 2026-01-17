// https://www.geeksforgeeks.org/problems/expression-contains-redundant-bracket-or-not/1

import java.util.*;

class Solution {
    public static boolean checkRedundancy(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch==')'){
                boolean hasOperator=false;
                while (!st.isEmpty() && st.peek()!='('){
                    char top=st.pop();
                    if(top=='+' || top=='-' || top=='*' || top=='/'){
                        hasOperator=true;
                    }
                }
                
                if (!st.isEmpty()) {
                    st.pop();
                }
                
                if (!hasOperator) {
                    return true;
                }
            }else{
                st.push(ch);
            }
        }
        
        return false;
    }
}
