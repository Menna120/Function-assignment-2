public class SumEven {
    public static void calculateEven(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Input array cannot be null or empty.");
            return;
        }

        int count = 0;
        long sum = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
                sum += i;
            }
        }

        System.out.println("The array has " + count + " even elements with sum of " + sum);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        calculateEven(numbers);
    }
}
