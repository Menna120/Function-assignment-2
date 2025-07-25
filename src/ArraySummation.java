public class ArraySummation {
    public static int getSummation(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i : arr) sum += i;

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of numbers: " + getSummation(numbers));
    }
}
