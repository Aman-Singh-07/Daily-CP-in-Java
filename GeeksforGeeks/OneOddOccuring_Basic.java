// https://www.geeksforgeeks.org/problems/find-the-odd-occurence4820/1?page=3&status=unsolved&sortBy=difficulty

class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                if(count%2==0) return arr[i];
                count=0;
            }else{
                count++;
            }
        }
        return arr[arr.length-1];
    }
}

// Alternative Approach
// class Solution {
//     // Method to find the element with odd occurrence in given array
//     int getOddOccurrence(int[] arr) {
//         // code here
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//         }
//         for(Map.Entry<Integer, Integer> entry:map.entrySet()){
//             if(entry.getValue()%2!=0){
//                 return entry.getKey();
//             }
//         }
//         return -1;
//     }
// }
