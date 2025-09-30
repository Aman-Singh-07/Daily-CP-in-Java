// https://www.geeksforgeeks.org/problems/generate-all-binary-strings/1

class Solution{
    public ArrayList<String> binstr(int n){
        ArrayList<String> list=new ArrayList<>();
        int total=1<<n;
        for(int i=0;i<total;i++){
            String bin=Integer.toBinaryString(i);
            while(bin.length()<n){
                bin="0"+bin;
            }
            list.add(bin);
        }
        return list;
    }
}
