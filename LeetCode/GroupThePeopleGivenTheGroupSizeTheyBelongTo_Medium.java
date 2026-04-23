// https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/?envType=problem-list-v2&envId=wqama0x5

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            groups.putIfAbsent(size, new ArrayList<>());
            List<Integer> currentGroup = groups.get(size);
            
            currentGroup.add(i);
            if (currentGroup.size() == size) {
                result.add(currentGroup);
                groups.remove(size);
            }
        }

        return result;
    }
}
