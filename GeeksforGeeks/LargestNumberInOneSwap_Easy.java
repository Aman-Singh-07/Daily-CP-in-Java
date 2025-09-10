// https://www.geeksforgeeks.org/problems/largest-number-in-one-swap1520/1

class Solution {
    public String largestSwap(String s) {
        char[] temp = s.toCharArray();
        char ch = s.charAt(s.length() - 1);

        for (int i = s.length() - 1; i >= 0; i--) {
            if (temp[i] > ch) {
                ch = temp[i];
            }
            temp[i] = ch;
        }

        char[] temp1 = s.toCharArray();
        char ch1 = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (temp1[i] < ch1) {
                ch1 = temp1[i];
            }
            temp1[i] = ch1;
        }

        int index = -1;
        char swapWith = '\0';

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > temp1[i]) {
                index = i;
                swapWith = temp[i];
                break;
            }
        }
        if (index == -1) return s;

        char[] temp2 = s.toCharArray();
        char c = temp2[index];
        temp2[index] = swapWith;

        for (int i = temp2.length - 1; i > index; i--) {
            if (temp2[i] == swapWith) {
                temp2[i] = c;
                break;
            }
        }

        return String.valueOf(temp2);
    }
}
