// https://leetcode.com/problems/group-anagrams/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            StringBuilder sb=new StringBuilder();
            for(char c:ch){
                sb.append(c);
            }
            String key=sb.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        List<List<String>> list=new ArrayList<>();
        for(List<String> l:map.values()){
            list.add(l);
        }
        return list;
    }
}
