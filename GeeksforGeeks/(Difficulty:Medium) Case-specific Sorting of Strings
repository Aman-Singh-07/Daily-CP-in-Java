// https://www.geeksforgeeks.org/problems/case-specific-sorting-of-strings4845/1

class Solution {
    public static String caseSort(String s) {
        // code here
        char[] ch=new char[s.length()];
        ArrayList<Character> sUpper=new ArrayList<>();
        ArrayList<Character> sLower=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
               sUpper.add(s.charAt(i));
            }
            else sLower.add(s.charAt(i));
        }
        
        Collections.sort(sUpper);
        Collections.sort(sLower);
        int l=0,u=0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                ch[i]=sUpper.get(u++);
            }
            else ch[i]=sLower.get(l++);
        }
        
        return new String(ch);
    }
}
