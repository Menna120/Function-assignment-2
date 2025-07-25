import java.util.HashMap;
import java.util.Map;

public class CountGeneral {
    public static void countGeneral(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("The array is null or empty. No elements to count.");
            return;
        }

        Map<Integer, Integer> counts = new HashMap<>();

        for (int i : arr) {
            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 3, 6};
        countGeneral(numbers);
    }
}
