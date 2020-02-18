class Monotone {

    // An array is monotonic if it is either monotone increasing or monotone decreasing.
    //
    // An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if
    // for all i <= j, A[i] >= A[j].
    //
    // Return true if and only if the given array A is monotonic.
    //
    //
    //
    // Example 1:
    //
    // Input: [1,2,2,3]
    // Output: true

    public static boolean isMonotonic(int[] A) {

        boolean inc = false;
        boolean dec = false;

        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] < A[i]) inc = true;
            if (A[i - 1] > A[i]) dec = true;

            if (inc && dec) return false;
        }

        return true;

    }
}
