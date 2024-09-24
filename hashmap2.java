import java.util.HashMap;
import java.util.Map;

public class hashmap2 {

    static void calculatefreequency(int arr[]) {
        HashMap<Integer, Integer> freqmap = new HashMap<>();

        for (int num : arr) {
            freqmap.put(num, freqmap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> ent : freqmap.entrySet()) {
            System.out.println(ent.getKey() + " " + ent.getValue());
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 4, 1 };
        calculatefreequency(arr);
    }
}
