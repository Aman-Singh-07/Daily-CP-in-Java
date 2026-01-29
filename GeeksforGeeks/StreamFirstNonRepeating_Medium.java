// https://www.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1

class Solution {
    public String firstNonRepeating(String s) {
        // code here
        int n = s.length();
        int[] freq=new int[26];       
        int[] firstPos=new int[26];   
        for(int i=0;i<26;i++) firstPos[i]=-1;
        for(int i=0;i<n;i++){
            int idx=s.charAt(i)-'a';
            if(firstPos[idx]==-1) firstPos[idx]=i;
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<n;i++){
            int idx=s.charAt(i)-'a';
            freq[idx]++; 
            char chosen='#';
            int earliest=n+1;
            for(int j=0; j<26;j++){
                if(freq[j]==1 && firstPos[j]<earliest){
                    chosen=(char) (j+'a');
                    earliest=firstPos[j];
                }
            }

            result.append(chosen);
        }

        return result.toString();
    }
}
