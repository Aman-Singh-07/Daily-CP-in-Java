// https://www.geeksforgeeks.org/problems/police-and-thieves--141631/1

class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        ArrayList<Integer> thief=new ArrayList<>();
        ArrayList<Integer> police=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='P') police.add(i);
            else thief.add(i);
        }
        int count=0;
        int i=0,j=0;
        while(i<police.size() && j<thief.size()){
            if(Math.abs(police.get(i)-thief.get(j))<=k){
                count++;
                i++;
                j++;
            }
            else if(police.get(i)>thief.get(j)) j++;
            else i++;
        }
        return count;
    }
}
