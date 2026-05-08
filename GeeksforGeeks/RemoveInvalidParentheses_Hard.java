// https://www.geeksforgeeks.org/problems/remove-invalid-parentheses/1

import java.util.*;

class Solution {
    public List<String> validParenthesis(String s) {
        List<String> res = new ArrayList<>();
        if (s == null) return res;
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.add(s);
        visited.add(s);
        boolean found = false;
        while (!q.isEmpty()) {
            int size = q.size();
            List<String> currentLevelResults = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                String curr = q.poll();

                if (isValid(curr)) {
                    currentLevelResults.add(curr);
                    found = true;
                }
                if (!found) {
                    for (int j = 0; j < curr.length(); j++) {
                        if (curr.charAt(j) != '(' && curr.charAt(j) != ')') continue;

                        String next = curr.substring(0, j) + curr.substring(j + 1);
                        if (!visited.contains(next)) {
                            visited.add(next);
                            q.add(next);
                        }
                    }
                }
            }

            if (found) {
                Collections.sort(currentLevelResults);
                return currentLevelResults;
            }
        }

        return res;
    }

    public boolean isValid(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') count++;
            else if (ch == ')') {
                count--;
                if (count < 0) return false;
            }
        }
        return count == 0;
    }
}
