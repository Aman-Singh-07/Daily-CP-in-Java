//  https://leetcode.com/problems/separate-the-digits-in-an-array/description/?envType=daily-question&envId=2026-05-11

class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int num:nums){
            while(num>0){
                l.add(num%10);
                num/=10;
            }
            for(int i=l.size()-1;i>=0;i--){
                list.add(l.get(i));
            }
            l.clear();
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++) arr[i]=list.get(i);
        return arr;
    }
}
