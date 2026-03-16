// https://leetcode.com/problems/get-biggest-three-rhombus-sums-in-a-grid/?envType=daily-question&envId=2026-03-16

class Solution {
    public int[] getBiggestThree(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int d=0;d<26;d++){
                    if(i-d<0 || i+d>=m || j-d<0 || j+d>=n) break;
                    int temp=0;
                    if(d==0) temp=arr[i][j];
                    else{
                        temp=arr[i-d][j]+arr[i+d][j]+arr[i][j-d]+arr[i][j+d];
                        for(int t=1;t<d;t++){
                            temp+=arr[i+t][j+d-t];
                            temp+=arr[i+t][j-d+t];
                            temp+=arr[i-t][j+d-t];
                            temp+=arr[i-t][j-d+t];
                        }
                    }
                    set.add(temp);
                }
            }
        }
        ArrayList<Integer> list=new ArrayList<>(set);
        Collections.sort(list,Collections.reverseOrder());
        int[] res=new int[Math.min(3,list.size())];
        for(int i=0;i<Math.min(3,list.size());i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
