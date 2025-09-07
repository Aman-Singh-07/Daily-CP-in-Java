// https://www.geeksforgeeks.org/problems/remove-duplicates3034/1?page=3&difficulty=Easy&status=unsolved&sortBy=submissions

// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        ArrayList<Character> list=new ArrayList<>();
        char[] ch=s.toCharArray();
        for(char c:ch){
            if(!list.contains(c)){
                list.add(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:list){
            sb.append(c);
        }
        return sb.toString();
        
    }
}
