// https://www.geeksforgeeks.org/problems/merge-three-sorted-arrays-1587115620/1

class Solution {
    public ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) {
        // code here
        int i=0,j=0,k=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<a.length || j<b.length || k<c.length){
            int val=Integer.MAX_VALUE;
            if(i<a.length) val=Math.min(a[i],val);
            if(j<b.length) val=Math.min(b[j],val);
            if(k<c.length) val=Math.min(c[k],val);
            
            list.add(val);
            
            if(i<a.length && a[i]==val) i++;
            else if(j<b.length && b[j]==val) j++;
            else k++;
        }
        return list;
    }
}
