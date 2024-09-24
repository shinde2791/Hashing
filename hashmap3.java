//3. Given two arrays, arr1 and arr2 of equal length N, the task is to determine if the given arrays are equal or not. Two arrays are considered equal if:
// Both arrays contain the same set of elements.
// The arrangements (or permutations) of elements may be different.
// If there are repeated elements, the counts of each element must be the same in both arrays.

// Input: arr1[] = {1, 2, 5, 4, 0}, arr2[] = {2, 4, 5, 0, 1}
// Output: Yes
import java.util.HashMap;
import java.util.Map;

public class hashmap3 {

    static boolean arrEqual(int arr1[], int arr2[]) {          
        if (arr1.length != arr2.length)
            return false;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int num : arr2) {
            if (!freq.containsKey(num))
                return false;
            freq.put(num, freq.get(num) - 1);
            if (freq.get(num) < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 3, 3, 4, 4, 4, 4 };
        int[] arr2 = { 1, 2, 2, 3, 3, 4, 4, 4, 4 };

        if (arrEqual(arr1, arr2) == true) {
            System.out.println("yes");
        } else {
            System.out.println("false");
        }
    }
}
