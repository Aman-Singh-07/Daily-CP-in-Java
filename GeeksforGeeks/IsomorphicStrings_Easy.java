// https://www.geeksforgeeks.org/problems/isomorphic-strings-1587115620/1

class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s1.length();i++){
            char c1=(s1.charAt(i));
            char c2=(s2.charAt(i));
            if(map.containsKey(c1)){
                if(map.get(c1)!=c2) return false;
            }
            else{
                if(set.contains(c2)) return false;
                map.put(c1,c2);
                set.add(c2);
            }
        }
        return true;
    }
}
