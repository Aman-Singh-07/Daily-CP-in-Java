// https://www.geeksforgeeks.org/problems/maximum-people-visible-in-a-line/1

class Solution {
    public int maxPeople(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int max=0;
        for(int num:arr) max=Math.max(num,max);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max) list.add(i);
        }
        int res=0;
        if(list.size()==1) return arr.length;
        if(list.size()>=2){
            ArrayList<Integer> l=new ArrayList<>();
            l.add(list.get(0)-0);
            for(int i=0;i<list.size()-1;i++){
                l.add(list.get(i+1)-list.get(i)-1);
            }
            l.add(arr.length-1-list.get(list.size()-1));
            for(int i=0;i<l.size()-1;i++){
                res=Math.max(l.get(i+1)+l.get(i)+1,res);
            }
            if(l.size()==1) res=l.get(0)+1;
        }
        return res;
    }
}
