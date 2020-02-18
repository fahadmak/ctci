public class SortedSquare {
    // Given an array of integers A sorted in non-decreasing order,
    // return an array of the squares of each number, also in sorted non-decreasing order.
    public static int[] sortedSquares(int[] A) {
        int i = 0;
        int j = A.length - 1;
        int [] result = new int[A.length];
        for (int m = A.length - 1; m >= 0; m--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[m] = A[i] * A[i];
                i++;
            } else {
                result[m] = A[j] * A[j];
                j--;
            }
        }
        return result;
    }
}
