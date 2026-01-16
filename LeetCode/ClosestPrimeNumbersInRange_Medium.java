// https://leetcode.com/problems/closest-prime-numbers-in-range/description/

class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i<=1) continue;
            if(i==2 || i==3) list.add(i);
            else if(i%2==0 || i%3==0) continue;
            else{
                boolean isTrue=true;
                for(int j=5;j*j<=i;j+=6){
                    if(i%j==0 || i%(j+2)==0){
                        isTrue=false;
                        break;
                    }
                }
                if(isTrue) list.add(i);
            }
        }
        if(list.size()<2) return new int[]{-1, -1};
        int min=Integer.MAX_VALUE;
        int[] result=new int[2];
        for(int i=1;i<list.size();i++){
            int diff=list.get(i)-list.get(i-1);
            if(diff<min){
                min=diff;
                result[0]=list.get(i-1);
                result[1]=list.get(i);
            }
        }
        
        return result;
    }
}
