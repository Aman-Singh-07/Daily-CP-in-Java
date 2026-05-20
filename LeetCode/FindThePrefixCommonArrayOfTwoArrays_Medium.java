// https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/description

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] C=new int[A.length];
        boolean[] a1=new boolean[A.length+1];
        boolean[] b1=new boolean[A.length+1];
        for(int i=1;i<=A.length;i++){
            a1[i]=false;
            b1[i]=false;
        }
        for(int i=0;i<A.length;i++){
            a1[A[i]]=true;
            b1[B[i]]=true;
            int count=0;
            for(int j=1;j<=A.length;j++){
                if(a1[j]&b1[j]) count++;
            }
            C[i]=count;
        }
        return C;
    }
}
