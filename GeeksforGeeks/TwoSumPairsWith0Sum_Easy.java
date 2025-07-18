// https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1?page=2&sortBy=submissions

class Solution{
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr){
        Set<Integer> set=new HashSet<>();
        Set<String> uniquePairs=new HashSet<>();
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        for(int num:arr){
            int opposite=-num;
            if(set.contains(opposite)){
                int a=Math.min(num,opposite);
                int b=Math.max(num,opposite);
                String pairKey=a+":"+b;
                uniquePairs.add(pairKey);
            }
            set.add(num);
        }
        for(String s:uniquePairs){
            String[] parts=s.split(":");
            int a=Integer.parseInt(parts[0]);
            int b=Integer.parseInt(parts[1]);
            ArrayList<Integer> pair=new ArrayList<>();
            pair.add(a);
            pair.add(b);
            result.add(pair);
        }
        result.sort((a,b)->{
            if(!a.get(0).equals(b.get(0)))
                return a.get(0)-b.get(0);
            return a.get(1)-b.get(1);
        });
        return result;
    }
}
