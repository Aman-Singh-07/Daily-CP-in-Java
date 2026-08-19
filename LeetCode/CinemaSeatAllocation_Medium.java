// https://leetcode.com/problems/cinema-seat-allocation/description/?envType=daily-question&envId=2026-08-19

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, List<Integer>> rowReservations = new HashMap<>();
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];
            if (!rowReservations.containsKey(row)) {
                rowReservations.put(row, new ArrayList<>());
            }
            rowReservations.get(row).add(col);
        }
        int count = (n - rowReservations.size()) * 2;
        for (int row : rowReservations.keySet()) {
            char[] rowSeats = "0000000000".toCharArray();
            
            for (int col : rowReservations.get(row)) {
                rowSeats[col - 1] = '1';
            }
            String s = String.valueOf(rowSeats);

            boolean leftAvailable = !s.substring(1, 5).contains("1");  
            boolean middleAvailable = !s.substring(3, 7).contains("1"); 
            boolean rightAvailable = !s.substring(5, 9).contains("1");  
            if (leftAvailable && rightAvailable) {
                count += 2; 
            } else if (leftAvailable || middleAvailable || rightAvailable) {
                count += 1;
            }
        }

        return count;
    }
}
