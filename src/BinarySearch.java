public class BinarySearch {
    /*
     * Performance Comparison: Binary Search vs. Linear Search
     *
     * Linear Search:
     * - Works on both sorted and unsorted arrays.
     * - Checks each element sequentially.
     * - Time Complexity:
     * - Best-Case: O(1) (target is the first element)
     * - Worst-Case: O(n) (target is last or not present)
     * - Average-Case: O(n)
     * - Performance degrades linearly with array size.
     *
     * Binary Search:
     * - REQUIRES the array to be sorted.
     * - Divides the search interval in half with each step.
     * - Time Complexity:
     * - Best-Case: O(1) (target is the middle element)
     * - Worst-Case: O(log n) (target not present or at ends)
     * - Average-Case: O(log n)
     * - Highly efficient for large arrays; performance degrades logarithmically.
     * For example, searching 1 million elements:
     * - Linear Search: up to 1,000,000 comparisons
     * - Binary Search: approx. 20 comparisons (log2(1,000,000) is about 19.9)
     *
     * Summary Comparison Table:
     * | Feature                | Linear Search          | Binary Search          |
     * | :--------------------- | :--------------------- | :--------------------- |
     * | Data Requirement       | Sorted or Unsorted     | Must be Sorted         |
     * | Best-Case              | O(1)                   | O(1)                   |
     * | Worst-Case             | O(n)                   | O(log n)               |
     * | Average-Case           | O(n)                   | O(log n)               |
     * | Performance for Large Arrays | Inefficient            | Highly efficient       |
     */

    public static int binarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedNumbers = {1, 5, 8, 12, 16, 23, 28, 30, 35, 40};
        int target = 12;
        int index = binarySearch(sortedNumbers, target);

        System.out.println("Target " + target + (index == -1 ? " not found" : " found at index: " + index));
    }
}