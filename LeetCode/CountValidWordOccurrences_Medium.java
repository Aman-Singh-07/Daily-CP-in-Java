// https://leetcode.com/problems/count-valid-word-occurrences/

class Solution {

    public void find(HashMap<String,Integer> map,String s){
        if(s.length()==0) return;
        map.put(s,map.getOrDefault(s,0)+1);
    }
    
    public int[] countWordOccurrences(String[] chunks, String[] queries) {
        StringBuilder sb=new StringBuilder();
        for(String st:chunks){
            sb.append(st);
        }
        String s=sb.toString();
        HashMap<String,Integer> map=new HashMap<>();
        StringBuilder temp=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch)) temp.append(ch);
            else if(ch=='-'){
                if(i>0 && i<s.length()-1 && Character.isLowerCase(s.charAt(i-1)) && Character.isLowerCase(s.charAt(i+1))){
                    temp.append('-');
                }else{
                    find(map,temp.toString());
                    temp.setLength(0);
                }
            }else{
                find(map,temp.toString());
                temp.setLength(0);
            }
        }
        find(map,temp.toString());
        String[] str=temp.toString().split("-");
        int count=0;
        Arrays.sort(str);
        int j=0;
        for(int i=0;i<queries.length && j<str.length;i++){
            if(str[j]==queries[i]){
                count++;
            }else j++;
        }
        int[] res=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            res[i]=map.getOrDefault(queries[i],0);
        }
        return res;
    }
}
