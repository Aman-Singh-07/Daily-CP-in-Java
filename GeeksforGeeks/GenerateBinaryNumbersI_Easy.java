// https://www.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/1

class Solution {
    public ArrayList<String> generateBinary(int n) {
        // code here
        ArrayList<String> res=new ArrayList<>();
        Queue<String> q=new LinkedList<>();
        q.add("1");
        while(n-->0){
            String curr=q.poll();
            res.add(curr);
            q.add(curr+"0");
            q.add(curr+"1");
        }
        return res;
    }
}
