// https://leetcode.com/problems/maximum-total-subarray-value-ii/?envType=daily-question&envId=2026-06-10

import java.util.PriorityQueue;

class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        
        // ---------------------------------------------------------
        // PART 1: SETUP THE SPARSE TABLE
        // A Sparse Table helps us find the Max or Min of ANY subarray 
        // in O(1) time. It precalculates answers for intervals of 
        // lengths that are powers of 2 (1, 2, 4, 8, 16...).
        // ---------------------------------------------------------
        
        // K is the maximum power of 2 we will ever need for an array of size 'n'.
        int K = (int) (Math.log(n) / Math.log(2)) + 1;
        
        // stMax[i][j] will store the Maximum value in the subarray 
        // starting at index 'i' with a length of 2^j.
        int[][] stMax = new int[n][K];
        // stMin[i][j] will store the Minimum value in the exact same way.
        int[][] stMin = new int[n][K];
        
        // Base Case: An interval of length 2^0 (which is 1).
        // The max/min of a single element is just the element itself.
        for (int i = 0; i < n; i++) {
            stMax[i][0] = nums[i];
            stMin[i][0] = nums[i];
        }
        
        // Build the rest of the table using previously calculated values.
        // 'j' represents the power of 2 for the current interval length.
        for (int j = 1; (1 << j) <= n; j++) {
            // 'i' is the starting index. We stop when the interval goes out of bounds.
            for (int i = 0; i + (1 << j) <= n; i++) {
                // To find the max of length 2^j, we combine two halves of length 2^(j-1).
                // Example: Max of 4 elements = max(first 2 elements, last 2 elements).
                stMax[i][j] = Math.max(stMax[i][j - 1], stMax[i + (1 << (j - 1))][j - 1]);
                stMin[i][j] = Math.min(stMin[i][j - 1], stMin[i + (1 << (j - 1))][j - 1]);
            }
        }
        
        // ---------------------------------------------------------
        // PART 2: THE MAX-HEAP (PRIORITY QUEUE)
        // We need to pick the top 'k' largest subarray values.
        // ---------------------------------------------------------
        
        // By default, Java's PriorityQueue is a Min-Heap (smallest on top).
        // We use a custom comparator to make it a Max-Heap (largest on top).
        // We will store arrays of size 3 inside it: [Subarray Value, Left Index, Right Index]
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(b[0], a[0]));
        
        // The Snowball Effect: For any starting index 'l', the absolute largest 
        // possible Value (Max - Min) happens when the window is as wide as possible.
        // So, we calculate the value for the window from 'l' all the way to the end ('n-1').
        for (int l = 0; l < n; l++) {
            long value = getValue(stMax, stMin, l, n - 1);
            pq.offer(new long[]{value, l, n - 1});
        }
        
        long ans = 0;
        
        // ---------------------------------------------------------
        // PART 3: EXTRACT THE TOP 'K' VALUES
        // ---------------------------------------------------------
        
        for (int i = 0; i < k; i++) {
            // Safety check: if the heap is empty before we reach 'k', stop.
            if (pq.isEmpty()) break;
            
            // Get the absolute best subarray currently available.
            long[] current = pq.poll();
            long value = current[0];
            int l = (int) current[1];
            int r = (int) current[2];
            
            // Add its value to our total answer.
            ans += value;
            
            // If we just used the best possible ending point ('r') for a starting point ('l'),
            // the NEXT best possible ending point for that exact same 'l' is just one step left.
            // We shrink the right side by 1 and throw it back into the heap to compete.
            if (r > l) {
                long newVal = getValue(stMax, stMin, l, r - 1);
                pq.offer(new long[]{newVal, l, r - 1});
            }
        }
        
        return ans;
    }
    
    // ---------------------------------------------------------
    // HELPER FUNCTION: GET VALUE IN O(1) TIME
    // ---------------------------------------------------------
    private long getValue(int[][] stMax, int[][] stMin, int l, int r) {
        // Find the length of the subarray we are querying.
        int len = r - l + 1;
        
        // Find the largest power of 2 that fits entirely inside this length.
        // For example, if len is 7, the largest power of 2 is 4 (so p = 2, because 2^2 = 4).
        int p = (int) (Math.log(len) / Math.log(2));
        
        // To cover the whole length of 7, we look at:
        // 1. The first 4 elements (starting from 'l').
        // 2. The last 4 elements (ending at 'r').
        // They will overlap in the middle, but that's fine for Max and Min!
        int maxVal = Math.max(stMax[l][p], stMax[r - (1 << p) + 1][p]);
        int minVal = Math.min(stMin[l][p], stMin[r - (1 << p) + 1][p]);
        
        // We cast to 'long' before subtracting to prevent Java from 
        // accidentally overflowing if maxVal is a large positive number 
        // and minVal is a large negative number.
        return (long) maxVal - (long) minVal;
    }
}
