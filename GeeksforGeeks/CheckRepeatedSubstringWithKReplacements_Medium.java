// https://www.geeksforgeeks.org/problems/check-if-a-string-is-repetition-of-its-substring-of-k-length3302/1

class Solution {
    public boolean kSubstr(String s, int k) {
        // code here
        if(s.length()%k!=0) return false;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i+=k){
            map.put(s.substring(i,i+k),map.getOrDefault(s.substring(i,i+k),0)+1);
        }
        if(map.size()>2) return false;
        if(map.size()==1) return true;
        boolean isOne=false;
        for(int value:map.values()){
            if(value==1) isOne=true;
        }
        return isOne;
    }
}
