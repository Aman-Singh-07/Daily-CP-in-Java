//  https://leetcode.com/problems/sort-integers-by-binary-reflection/

class Solution {
    public int[] sortByReflection(int[] nums) {
        ArrayList<int[]> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s1=Integer.toBinaryString(nums[i]);
            String rev=new StringBuilder(s1).reverse().toString();
            int num1=Integer.parseInt(rev,2);
            list.add(new int[]{nums[i],num1,i});
        }
        list.sort((a,b)->{
            if(a[1]!=b[1]) return Integer.compare(a[1],b[1]);
            return Integer.compare(a[0],b[0]);
        });
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=list.get(i)[0];
        }
        return arr;
        
    }
}
