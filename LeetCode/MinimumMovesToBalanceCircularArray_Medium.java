// https://leetcode.com/problems/minimum-moves-to-balance-circular-array/description/

class Solution {
    public long minMoves(int[] balance) {
        long res=0;
        long sum=0;
        long count=0;
        for(int num:balance){
            sum+=num;
            if(num>=0) count++;
        }
        if(count==balance.length) return 0;
        if(sum<0) return -1;
        int index=-1;
        for(int i=0;i<balance.length;i++){
            if(balance[i]<0){
                index=i;
                break;
            }
        }
        if(index==-1) return -1;
        long num=-balance[index];
        for(int i=1;i<=balance.length/2 && num>0;i++){
            int left=(index-i+balance.length)%(balance.length);
            int right=(index+i)%(balance.length);
            if(balance[left]>0 && num>0){
                long temp=Math.min((long)balance[left],num);
                balance[left]-=(int)temp;
                num-=temp;
                res+=temp*i;
            }
            if(balance[right]>0 && num>0){
                long temp=Math.min((long)balance[right],num);
                balance[right]-=(int)temp;
                num-=temp;
                res+=temp*i;
            }
            
        }
        return num==0?res:-1;
        
    }
}
