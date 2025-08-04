// https://leetcode.com/problems/next-greater-element-iii/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int nextGreaterElement(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        int tempNum=n;
        while(tempNum>0){
            list.add(0,tempNum%10); 
            tempNum/=10;
        }
        int i=list.size()-2;
        while(i>=0 && list.get(i)>=list.get(i+1)){
            i--;
        }

        if(i<0) return -1; 
        int j=list.size()-1;
        while(list.get(j)<=list.get(i)){
            j--;
        }
        int temp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
        int left=i+1,right=list.size()-1;
        while(left<right){
            temp=list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
        long result=0;
        for(int digit:list){
            result=result*10+digit;
        }

        return (result>Integer.MAX_VALUE)?-1:(int) result;
    }
}
