public class Count2 {
    public static int count2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i : arr) {
            if (i == 2) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("The array has the number 2: " + count2(numbers) + " times");
    }
}
