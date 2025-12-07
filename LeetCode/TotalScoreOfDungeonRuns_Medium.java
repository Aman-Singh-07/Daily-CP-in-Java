// https://leetcode.com/problems/total-score-of-dungeon-runs/description/

class Solution {
    public long totalScore(int hp, int[] damage, int[] requirement) {
        long sum=0;
        long[] arr=new long[damage.length];
        arr[0]=damage[0];
        for(int i=1;i<damage.length;i++){
            arr[i]=arr[i-1]+damage[i];
        }
        for(int i=0;i<damage.length;i++){
            long temp=arr[i]-(hp-requirement[i]);
            int left=0;
            int right=i;
            int pos=i+1;
            while(left<=right){
                int mid=(left+right)/2;
                long val=(mid>0?arr[mid-1]:0);
                if(val>=temp){
                    pos=mid;
                    right=mid-1;
                } else left=mid+1;
            }
            int count=(pos<=i)?(i-pos+1):0;
            sum+=count;
        }
        return sum;
    }
}
