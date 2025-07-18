// https://leetcode.com/problems/finding-3-digit-even-numbers/description/?envType=daily-question&envId=2025-05-12

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> s=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            if (digits[i]==0) continue;
            for(int j=0;j<n;j++){
                if (i==j) continue;
                for(int k=0;k<n;k++){
                    if (k==i || k==j) continue;
                    int num=digits[i]*100+digits[j]*10+digits[k];
                    if(num%2==0){
                        s.add(num);
                    }
                }
            }
        }
        int[] res=new int[s.size()];
        int  j=0;
        for(int i:s){
            res[j]=i;
            j++;
        }
        Arrays.sort(res);
        return res;
        
    }
}
