//  https://leetcode.com/problems/maximum-69-number/

class Solution {
    public int maximum69Number (int num) {
        int[] arr=new int[4];
        int temp=num;
        int index=0;
        while(temp>0){
            int r=temp%10;
            arr[index]=r;
            temp/=10;
            index++;
        }
        for(int i=0;i<arr.length/2;i++){
            int t=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=t;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==6){
                arr[i]=9;
                break;
            }
        }
        int result=0;
        for(int i=0;i<arr.length;i++){
            result=result*10+arr[i];
        }
        return result;
        
    }
}
