public class NumOfElements {
    public static int getNumOfElements(int[] arr) {
        if (arr == null) {
            return 0;
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Number of elements in numbers: " + getNumOfElements(numbers));
    }
}
