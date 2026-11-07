// https://www.geeksforgeeks.org/problems/new-registration-system--150419/1

class Solution {
    public ArrayList<String> generateUsernames(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> reserved = new HashSet<>(Arrays.asList(arr));
        HashSet<String> firstTimeSeen = new HashSet<>();
        HashSet<String> generatedSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (firstTimeSeen.contains(s)) {
                int suffix = 1;
                String candidate = s + suffix;
                while (reserved.contains(candidate) || generatedSet.contains(candidate)) {
                    suffix++;
                    candidate = s + suffix;
                }
                s = candidate;
            } else {
                firstTimeSeen.add(s);
            }
            list.add(s);
            generatedSet.add(s);
        }

        return list;
    }
}
