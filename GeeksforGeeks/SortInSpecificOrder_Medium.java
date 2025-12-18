// https://www.geeksforgeeks.org/problems/sort-in-specific-order2422/1

class Solution {
    public void sortIt(int[] arr) {
        // code here
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int num:arr){
            if(num%2!=0) list1.add(num);
            else list2.add(num);
        }
        Collections.sort(list1,Collections.reverseOrder());
        Collections.sort(list2);
        for(int i=0;i<list1.size();i++){
            arr[i]=list1.get(i);
        }
        for(int i=list1.size();i<list2.size()+list1.size();i++){
            arr[i]=list2.get(i-list1.size());
        }
        
    }
}
