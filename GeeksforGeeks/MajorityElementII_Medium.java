// https://www.geeksforgeeks.org/problems/majority-vote/1

class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        ArrayList<Integer> list=new ArrayList<>();
        int count=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                if(count>(arr.length/3)){
                    list.add(arr[i]);
                }
                count=1;
            }
            else count++;
        }
        if(count>(arr.length/3)) list.add(arr[arr.length-1]);
        return list;
    }
}
