// https://www.geeksforgeeks.org/problems/check-frequencies4211/1

class Solution {
    boolean sameFreq(String s) {
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        int[] freqs=new int[26];
        int idx=0,count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                freqs[idx++]=count;
                count=1;
            }
        }
        freqs[idx++]=count;
        Arrays.sort(freqs,0,idx);
        if (freqs[0]==freqs[idx-1]) return true;
        if (freqs[0]==1 && freqs[1]==freqs[idx-1]) return true;
        if (freqs[0]==freqs[idx-2] && freqs[idx-1]-freqs[idx-2]==1) return true;
        return false;
    }
}
