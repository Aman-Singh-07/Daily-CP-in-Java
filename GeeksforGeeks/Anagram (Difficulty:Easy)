// https://www.geeksforgeeks.org/problems/anagram-1587115620/1?page=3&sortBy=submissions

class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        if(s1.length()!=s2.length()) return false;
       ArrayList<Character> c1=new ArrayList<>();
       ArrayList<Character> c2=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            c1.add(s1.charAt(i));
            c2.add(s2.charAt(i));
        }
        Collections.sort(c1);
        Collections.sort(c2);
        return c1.equals(c2);
    }
}
