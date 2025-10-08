// https://leetcode.com/problems/permutations/description/

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        prmt(nums,0,nums.length-1,res);
        return res;
        
    }
    public static void prmt(int[] nums,int l,int r,List<List<Integer>> res){
        if(l==r){
            List<Integer> list=new ArrayList<>();
            for(int num:nums) list.add(num);
            res.add(list);
        }else{
            for(int i=l;i<=r;i++){
                swap(nums,l,i);
                prmt(nums,l+1,r,res);
                swap(nums,l,i);
            }
        }
    }

    public static void swap(int[] nums, int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}
