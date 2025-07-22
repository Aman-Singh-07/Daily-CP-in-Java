//  https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1?page=5&status=unsolved&sortBy=submissions

// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> negative=new ArrayList<>();
        ArrayList<Integer> positive=new ArrayList<>();
        for(int num:arr){
            if(num>=0) positive.add(num);
            else negative.add(num);
        }
        ArrayList<Integer> res=new ArrayList<>();
        int i=0,j=0;
        while(i<positive.size() && j<negative.size()){
            res.add(positive.get(i++));
            res.add(negative.get(j++));
        }
        while(i<positive.size()){
            res.add(positive.get(i++));
        }
        while(j<negative.size()){
            res.add(negative.get(j++));
        }
        
        for(int k=0;k<arr.size();k++){
            arr.set(k, res.get(k)); 
        }
    }
}
