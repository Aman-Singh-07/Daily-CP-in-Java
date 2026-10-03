 // https://www.geeksforgeeks.org/problems/form-coils-in-a-matrix4726/1

class Solution {
    public ArrayList<ArrayList<Integer>> formCoils(int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> coil1 = new ArrayList<>();
        ArrayList<Integer> coil2 = new ArrayList<>();

        int size = 4 * n;
        int r = 0, c = 0;

        coil1.add(getElementValue(r, c, size));
        coil2.add(getComplementValue(r, c, size));

        int[] dr = {1, 0, -1, 0};
        int[] dc = {0, 1, 0, -1};

        int dir = 0; 
        int steps = size - 1; 
        int turn = 0;

        while (steps > 0) {
            for (int i = 0; i < steps; i++) {
                r += dr[dir];
                c += dc[dir];
                coil1.add(getElementValue(r, c, size));
                coil2.add(getComplementValue(r, c, size));
            }

            dir = (dir + 1) % 4;

            if (turn == 0) {
                steps -= 1;
            } else if (turn % 2 == 0) {
                steps -= 2;
            }

            turn++;
        }

        result.add(coil1);
        result.add(coil2);
        return result;
    }

    private int getElementValue(int r, int c, int size) {
        return r * size + c + 1;
    }

    private int getComplementValue(int r, int c, int size) {
        int compR = size - 1 - r;
        int compC = size - 1 - c;
        return compR * size + compC + 1;
    }
}
