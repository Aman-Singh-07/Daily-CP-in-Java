// https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/description/?envType=daily-question&envId=2025-09-13

class Solution {
    public int maxFreqSum(String s) {
        ArrayList<Character> s1=new ArrayList<>();
        ArrayList<Character> s2=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                s1.add(c);
            }
            else{
                s2.add(c);
            }
        }
        Collections.sort(s1);
        Collections.sort(s2);
        int f1=0;
        int f2=0;
        int count1=(s1.size()==0)?0:1;
        int count2=(s2.size()==0)?0:1;
        for(int i=1;i<s1.size();i++){
            if(s1.get(i)!=s1.get(i-1)){
                f1=Math.max(f1,count1);
                count1=1;
            }
            else count1++;
        }
        for(int i=1;i<s2.size();i++){
            if(s2.get(i)!=s2.get(i-1)){
                f2=Math.max(f2,count2);
                count2=1;
            }
            else count2++;
        }
        f1=Math.max(f1,count1);
        f2=Math.max(f2,count2);
        return f1+f2;

        
    }
}
