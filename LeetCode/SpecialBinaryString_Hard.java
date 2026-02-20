// https://leetcode.com/problems/special-binary-string/description/?envType=daily-question&envId=2026-02-20

class Solution {
    public String makeLargestSpecial(String s) {
        int count1=0;
        int i=0;
        ArrayList<String> list=new ArrayList<>();
        for(int j=0;j<s.length();++j){
            if(s.charAt(j)=='1') count1++;
            else count1--;
            if(count1==0){
                list.add('1'+makeLargestSpecial(s.substring(i+1,j))+'0');
                i=j+1;
            }
        }
        Collections.sort(list);
        StringBuilder sb=new StringBuilder();
        for(i=list.size()-1;i>=0;i--) sb.append(list.get(i));
        return sb.toString();
    }
}
