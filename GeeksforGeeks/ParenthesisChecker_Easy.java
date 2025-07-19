//  https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1?page=1&sortBy=submissions


class Solution {
    static boolean isBalanced(String s) {
        // code here
        int length;
        do{
            length=s.length();
            s=s.replace("()","").replace("{}","").replace("[]","");
        }while(s.length()!=length);
        return length==0;
    }
}
