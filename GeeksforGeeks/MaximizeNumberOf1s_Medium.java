//  https://www.geeksforgeeks.org/problems/maximize-number-of-1s0905/1

class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                list.add(i);
            }
        }
        if(k==0){
            int max=0,count=0;
            for(int num:arr){
                if(num==1){
                    count++;
                    max=Math.max(max,count);
                }else{
                    count=0;
                }
            }
            return max;
        }
        if(list.size()<=k) return arr.length;
        int max=0;
        for(int i=0;i<=list.size()-k;i++){
            int left=(i==0)?0:list.get(i-1)+1;
            int right=(i+k-1<list.size())?list.get(i+k-1):arr.length-1;
            int nextZero=(i+k<list.size())?list.get(i+k):arr.length;
            max=Math.max(max,nextZero-left);
        }
        return max;
    }
}
