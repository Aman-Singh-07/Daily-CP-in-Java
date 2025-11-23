// https://leetcode.com/problems/greatest-sum-divisible-by-three/description/?envType=daily-question&envId=2025-11-23

class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum=0;
        ArrayList<Integer> rem1=new ArrayList<>();
        ArrayList<Integer> rem2=new ArrayList<>();
        for(int num:nums){
            sum+=num;
            if(num%3==1) rem1.add(num);
            else if(num%3==2) rem2.add(num);
        }
        Collections.sort(rem1);
        Collections.sort(rem2);
        int mod=sum%3;
        if(mod==0) return sum;
        int option1=0, option2=0;
        if(mod==1){
            if (!rem1.isEmpty()) option1=sum-rem1.get(0);
            if (rem2.size()>=2) option2=sum-rem2.get(0)-rem2.get(1);
        }else{
            if (!rem2.isEmpty()) option1=sum-rem2.get(0);
            if (rem1.size()>=2) option2=sum-rem1.get(0)-rem1.get(1);
        }
        return Math.max(option1, option2);
    }
}
