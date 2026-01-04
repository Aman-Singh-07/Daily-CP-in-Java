//  https://leetcode.com/problems/word-squares-ii/description/

class Solution {
    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> res=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i==j) continue;
                for(int k=0;k<words.length;k++){
                    if(k==j || k==i) continue;
                    for(int l=0;l<words.length;l++){
                        if(l==j || l==k || l==i) continue;
                        if(words[i].charAt(0)==words[j].charAt(0) && words[i].charAt(3)==words[k].charAt(0) && words[l].charAt(0)==words[j].charAt(3) && words[l].charAt(3)==words[k].charAt(3)){
                            res.add(Arrays.asList(words[i],words[j],words[k],words[l]));
                        }
                    }
                }
            }
        }  
        Sort(res);
        return res;    
    }

    public static void Sort(List<List<String>> res){
        res.sort((a,b)->{
            for(int i=0;i<4;i++){
                int j=a.get(i).compareTo(b.get(i));
                if(j!=0) return j;
            }
            return 0;
        });
    }
}
