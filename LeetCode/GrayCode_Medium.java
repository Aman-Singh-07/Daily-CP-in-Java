// https://leetcode.com/problems/gray-code/

class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        int length=1<<n;
        for(int i=0;i<length;i++){
            list.add(i^(i>>1));
        }
        return list;
        
    }
}
