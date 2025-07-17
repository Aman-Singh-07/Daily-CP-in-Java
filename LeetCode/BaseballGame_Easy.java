// https://leetcode.com/problems/baseball-game/

class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            String op=operations[i];
            if(op.equals("D")){
                if(!l.isEmpty()){
                    l.add(2*l.get(l.size()-1));
                }
            }
            else if(op.equals("C")){
                if(!l.isEmpty()){
                    l.remove((l.size()-1));
                }
            }
            else if(op.equals("+")){
                if(l.size()>=2){
                    l.add(l.get(l.size()-1)+l.get(l.size()-2));
                }
            }
            else{
                l.add(Integer.valueOf(op));
            }
        }
        int sum=0;
        for(int i:l){
            sum+=i;
        }
        return sum;
        
    }
}
