public class MinNum {
    public static int getMin(int[] arr){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty.");
        }

        int minNum = arr[0];
        for (int i : arr) {
            if (i < minNum) minNum = i;
        }
        return minNum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Min element in numbers: " + getMin(numbers));
    }
}
