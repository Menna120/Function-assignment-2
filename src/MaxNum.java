public class MaxNum {
    public static int getMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty.");
        }

        int maxNum = arr[0];
        for (int i : arr) {
            if (i > maxNum) maxNum = i;
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Max element in numbers: " + getMax(numbers));
    }
}
