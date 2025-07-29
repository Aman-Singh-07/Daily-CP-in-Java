// https://www.geeksforgeeks.org/problems/ascii-range-sum/1

class Solution {
    public ArrayList<Integer> asciirange(String s) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!set.contains(ch)){
                int lastIndex=s.lastIndexOf(ch);
                if(lastIndex>i){
                    int sum=0;
                    for(int j=i+1;j<lastIndex;j++){
                        sum+=s.charAt(j);
                    }
                    if(sum!=0)
                    list.add(sum);
                }
                set.add(ch);
            }
        }
        return list;
    }
}
