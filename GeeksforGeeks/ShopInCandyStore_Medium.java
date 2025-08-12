// https://www.geeksforgeeks.org/problems/shop-in-candy-store1145/1

class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        Arrays.sort(prices);
        int n=prices.length;
        int minSum=0;
        int i=0;
        int end=n-1;
        while(i<=end){
            minSum+=prices[i++];
            end-=k;
        }
        int maxSum=0;
        int start=0;
        int j=n-1;
        while(start<=j){
            maxSum+=prices[j--];
            start += k;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(minSum);
        list.add(maxSum);
        return list;
    }
}
