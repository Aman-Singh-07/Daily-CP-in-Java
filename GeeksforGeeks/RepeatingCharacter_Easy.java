// https://www.geeksforgeeks.org/problems/repeating-character-first-appearance-leftmost/1

class Solution {
    public int repeatedCharacter(String S) {
        // code here
        int index=-1;
        ArrayList<Character> list=new ArrayList<>();
        for(int i=S.length()-1;i>=0;i--){
            if(list.contains(S.charAt(i))) index=i;
            list.add(S.charAt(i));
        }
        return index;
    }
}
