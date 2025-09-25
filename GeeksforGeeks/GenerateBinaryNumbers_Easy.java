// https://www.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/1

class Solution {
    public ArrayList<String> generateBinary(int n) {
        // code here
        ArrayList<String> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String s=Integer.toBinaryString(i);
            list.add(s);
        }
        return list;
    }
}
