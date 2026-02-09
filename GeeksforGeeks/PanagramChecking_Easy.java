// https://www.geeksforgeeks.org/problems/pangram-checking-1587115620/1

class Solution {
    public static boolean checkPangram(String s) {
        // code here
        s=s.toLowerCase();
        HashSet<Character> set=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(Character.isAlphabetic(ch)) set.add(ch);
        }
        return set.size()==26;
    }
}
