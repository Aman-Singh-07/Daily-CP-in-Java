// https://www.geeksforgeeks.org/problems/tywins-war-strategy0527/1

class Solution {
    public int minSoldiers(int[] arr, int k) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr){
            if(num%k!=0){
                list.add(((num/k)+1)*k-num);
            }
            else list.add(0);
        }
        int sum=0;
        Collections.sort(list);
        for(int i=0;i<(arr.length+1)/2;i++){
            sum+=list.get(i);
        }
        return sum;
    }
}
