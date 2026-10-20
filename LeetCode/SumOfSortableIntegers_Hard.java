// https://leetcode.com/problems/sum-of-sortable-integers/?envType=daily-question&envId=2026-10-20

class Solution {
    public int sortableIntegers(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=nums[i];
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                if(n/i!=i) list.add(n/i);
            }
        }
        int res=0;
        for(int k:list){
            boolean isTrue=true;
            for(int i=0;i<n && isTrue;i+=k){
                int desc=0,idx=-1;
                for(int j=0;j<k;j++){
                    int a=nums[i+j];
                    int b=nums[i+(j+1)%k];
                    if(a>b){
                        desc++;
                        idx=j;
                        if(desc>1) break;
                    }
                }
                if(desc>1){
                    isTrue=false;
                    break;
                }
                int r=(desc==0)?0:(idx+1)%k;
                for(int j=0;j<k;j++){
                    if(nums[i+(j+r)%k]!=arr[j+i]){
                        isTrue=false;
                        break;
                    }
                }
            }if(isTrue) res+=k;
        }
        return res;
    }

}
