// https://leetcode.com/problems/self-dividing-numbers/description/?envType=problem-list-v2&envId=maths-m2-divisibility-modular-arithmetic

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelf(i)) list.add(i);
        }
        return list;
    }
    public boolean isSelf(int num){
        int temp=num;
        while(temp>0){
            int rem=temp%10;
            if(rem==0) return false;
            if(num%rem!=0) return false;
            temp/=10;
        }
        return true;
    }
}
