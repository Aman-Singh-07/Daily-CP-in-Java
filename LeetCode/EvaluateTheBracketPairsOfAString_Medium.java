// https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/?envType=daily-question&envId=2026-09-26

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(List<String> list:knowledge){
            map.put(list.get(0),list.get(1));
        }
        StringBuilder key=new StringBuilder();
        StringBuilder res=new StringBuilder();
        boolean isTrue=false;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                isTrue = true;
            }
            else if(ch == ')') {
                if(map.containsKey(key.toString())) {
                    res.append(map.get(key.toString()));
                }
                else {
                    res.append("?");
                }
                isTrue = false;
                key.setLength(0);
            }
            else if(isTrue) {
                key.append(ch);
            }
            else {
                res.append(ch);
            }
        }
        return res.toString();
    }
}
