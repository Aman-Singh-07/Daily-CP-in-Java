// https://leetcode.com/problems/closest-divisors/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int[] closestDivisors(int num) {
        int n1=num+1;
        int n2=num+2;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=n1;i++){
            if(n1%i==0){
                if(n1/i!=i){
                    list.add(Math.abs(i-(n1/i)));
                    list.add(i);
                    list.add(n1/i);
                }
                else{
                    list.add(0);
                    list.add(i);
                    list.add(i);
                }
            }
        }
        for(int i=1;i*i<=n2;i++){
            if(n2%i==0){
                if(n2/i!=i){
                    list.add(Math.abs(i-(n2/i)));
                    list.add(i);
                    list.add(n2/i);
                }
                else{
                    list.add(0);
                    list.add(i);
                    list.add(i);
                }
            }
        }
        int min=list.get(0);
        for(int i=0;i<list.size();i+=3){
            if(list.get(i)<min){
                min=list.get(i);
            }
        }
        int[] res=new int[2];
        for(int i=0;i<list.size();i+=3){
            if(list.get(i)==min && (list.get(i+1)*list.get(i+2)==n1 || list.get(i+1)*list.get(i+2)==n2) ){
                res[0]=list.get(i+1);
                res[1]=list.get(i+2);
            }
        }

        return res;
    }
}
