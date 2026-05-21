// https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/description/?envType=daily-question&envId=2026-05-21

HashSet<Integer> prefixes = new HashSet<>();
        
        for (int val : arr1) {
            while (val > 0) {
                prefixes.add(val);
                val /= 10;
            }
        }
        
        int maxLength = 0;
        
        for (int val : arr2) {
            while (val > 0) {
                if (prefixes.contains(val)) {
                    int currentLength = String.valueOf(val).length();
                    maxLength = Math.max(maxLength, currentLength);
                    break;
                }
                val /= 10;
            }
        }
        
        return maxLength;
    }
