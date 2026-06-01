// https://leetcode.com/problems/lexicographically-maximum-mex-array/

class Solution {
    public int[] maximumMEX(int[] nums) {
        int n=nums.length;
        int m=n+2;
        int[] suffix=new int[n];
        boolean[] isVisited=new boolean[m];
        int mex=0;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<m) isVisited[nums[i]]=true;
            while(isVisited[mex]) mex++;
            suffix[i]=mex;
        }
        ArrayList<Integer> list=new ArrayList<>();
        int[] check=new int[m];
        for(int i=0;i<check.length;i++){
            check[i]=-1;
        }
        int temp=0;
        int prev=0;
        for(int i=0;i<n;i++){
            if(nums[i]<m) check[nums[i]]=prev;
            while(check[temp]==prev) temp++;
            if(temp==suffix[prev]){
                list.add(temp);
                temp=0;
                prev=i+1;
            }
        }
        
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++) res[i]=list.get(i);
        return res;
    }
}
