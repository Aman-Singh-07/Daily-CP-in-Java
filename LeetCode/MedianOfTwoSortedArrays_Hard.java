// https://leetcode.com/problems/median-of-two-sorted-arrays/description/

class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int[] arr=new int[num1.length+num2.length];
        int i=0,j=0,k=0;
        while(i<num1.length && j<num2.length){
            if(num1[i]>=num2[j]){
                arr[k]=(num2[j]);
                j++;
            }
            else{
                arr[k]=(num1[i]);
                i++;
            }
            k++;
        }
        while(i<num1.length){
            arr[k]=(num1[i]);
            i++;
            k++;
        }
        while(j<num2.length){
            arr[k]=(num2[j]);
            j++;
            k++;
        }
        if(arr.length%2!=0){
            return (double) arr[arr.length/2];
        }
        int a=(arr.length/2)-1;
        int b=(arr.length/2);
        return (arr[a]+arr[b])/2.0;


        
    }
}
