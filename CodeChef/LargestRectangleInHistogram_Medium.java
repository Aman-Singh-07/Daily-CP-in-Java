// https://www.codechef.com/problems/PREP22?tab=statement

public static long largestRectangleArea(int N, int[] A) {
    Stack < Integer > stack = new Stack < > ();
    long maxArea = 0;

    for (int i = 0; i <= N; i++) {
        long currentHeight = (i == N) ? 0 : A[i];

        while (!stack.isEmpty() && currentHeight < A[stack.peek()]) {
            long height = A[stack.pop()];
            long width = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }
        stack.push(i);
    }

    return maxArea;
}
