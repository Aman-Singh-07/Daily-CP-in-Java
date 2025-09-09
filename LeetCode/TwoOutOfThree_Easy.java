// https://leetcode.com/problems/two-out-of-three/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public List<Integer> twoOutOfThree(int[] num1, int[] num2, int[] num3) {
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        HashSet<Integer> s3=new HashSet<>();
        for(int num:num1) s1.add(num);
        for(int num:num2) s2.add(num);
        for(int num:num3) s3.add(num);
        for(int num:s1) list.add(num);
        for(int num:s2) list.add(num);
        for(int num:s3) list.add(num);
        Collections.sort(list);
        ArrayList<Integer> res=new ArrayList<>();
        int count=1;
        for(int i=1;i<list.size();i++){
            if(list.get(i).equals(list.get(i-1))){
                count++;
            }else{
                if(count>=2) res.add(list.get(i-1)); 
                count=1;
            }
        }
        if(count>=2) res.add(list.get(list.size()-1));
        return res;
        
    }
}
