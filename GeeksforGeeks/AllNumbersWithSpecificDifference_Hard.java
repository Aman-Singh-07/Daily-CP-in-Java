// https://www.geeksforgeeks.org/problems/all-numbers-with-specific-difference3558/1

class Solution {
    public int getCount(long n, long d) {
        long low = 1, high = n;
        long firstOccurrence = -1;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            if (mid - sumOfDigits(mid) >= d) {
                firstOccurrence = mid; 
                high = mid - 1;        
            } else {
                low = mid + 1;        
            }
        }

        if (firstOccurrence == -1) return 0;
        return (int)(n - firstOccurrence + 1);
    }

    public long sumOfDigits(long num) {
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
