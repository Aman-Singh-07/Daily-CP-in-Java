// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] arrInt=new Integer[arr.length];
        int m=0;
        for(int num:arr){
            arrInt[m++]=num;
        }
        Arrays.sort(arrInt, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            return (countA != countB) ? countA - countB : a - b;
        });
        int k=0;
        for(Integer num:arrInt){
            arr[k++]=num;
        }
        return arr;
        
    }
}
