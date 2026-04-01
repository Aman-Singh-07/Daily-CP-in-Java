// https://www.geeksforgeeks.org/problems/rearrange-characters4649/1

class Solution {
    // Function to rearrange the characters in a string such that
    // no two adjacent characters are same.
    static String rearrangeCharacters(String str) {
        // Your code here
        PriorityQueue<int[]> maxHeap=new PriorityQueue<>((a,b)->b[0]-a[0]);
        int[] freq=new int[26];
        for(char c:str.toCharArray()) freq[c-'a']++;
        for(int i=0;i<26;i++){
            if(freq[i]>0) maxHeap.add(new int[]{freq[i],i+'a'});
        }
        StringBuilder result=new StringBuilder();
        int[] prev=new int[]{-1,'#'};
        while(!maxHeap.isEmpty()){
            int[] current=maxHeap.poll();
            result.append((char) current[1]);
            current[0]--;
            if(prev[0]>0){
                maxHeap.add(prev);
            }
            prev=current;
        }
        if(result.length()!=str.length()) return "";
        return result.toString();
        
    }
}
