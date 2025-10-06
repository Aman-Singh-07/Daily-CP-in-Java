// https://leetcode.com/problems/permutation-sequence/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> num=new ArrayList<>();
        for(int i=1;i<=n;i++){
            num.add(i);
        }
        int[] fact=new int[n+1];
        fact[0]=1;
        for(int i=1;i<=n;i++){
            fact[i]=fact[i-1]*i;
        }
        k--;
        StringBuilder sb=new StringBuilder();
        for(int i=n;i>=1;i--){
            int index=k/fact[i-1];
            sb.append(num.get(index));
            num.remove(index);
            k%=fact[i-1];
        }
        return sb.toString();
    }
}
