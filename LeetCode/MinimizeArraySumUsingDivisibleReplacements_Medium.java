// https://leetcode.com/problems/minimize-array-sum-using-divisible-replacements/description/

class Solution {
    public long minArraySum(int[] nums) {
        long sum=0;
        if(nums.length==0) return 0;
        int n=nums.length;
        int max=0;
        for(int num:nums) if(num>max) max=num;
        boolean[] freq=new boolean[max+1];
        for(int num:nums) freq[num]=true;
        int[] find=new int[max+1];
        for(int i=1;i<=max;i++){
            find[i]=i;
        }
        for(int i=1;i<=max;i++){
            if(freq[i]){
                for(int j=2*i;j<=max;j+=i){
                    if(freq[j] && find[j]==j) find[j]=i;
                }
            }
        }
        long res=0;
        for(int  num:nums){
            res+=find[num];
        }
        TreeSet<Integer> set=new TreeSet<>();
        for(int num:nums) set.add(num);
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>(set);
        // for(int i=0;i<list.size();i++){
        //     int num=list.get(i);
        //     int div=num;
        //     for(int j=0;j<i;j++){
        //         int temp=list.get(j);
        //         if(num%temp==0){
        //             div=temp;
        //             break;
        //         }
        //     }
        //     map.put(num,div);
        // }
        
        return res;
    }
}
