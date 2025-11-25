// https://www.codechef.com/problems/MAXCOUNT

class Solution {
    public int[] mostFrequent(int[] arr) {
        // write your code here 
        int max=Integer.MAX_VALUE;
        int maxCount=0;
        int count=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                if(count>maxCount){
                    maxCount=count;
                    max=arr[i];
                }
                count=1;
            }else{
                count++;
            }
        }
        if(count>maxCount){
            maxCount=count;
            max=arr[arr.length-1];
        }
        int[] res=new int[2];
        res[0]=max;
        res[1]=maxCount;
        return res;
    }
}
