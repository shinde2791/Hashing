// 5 Given a matrix of distinct values and a sum. The task is to find all the pairs in a given matrix whose summation is equal to the given sum. Each element of a pair must be from different rows i.e; the pair must not lie in the same row.
// Examples:  
// Input : mat[4][4] = {{1, 3, 2, 4},
//                      {5, 8, 7, 6},
//                      {9, 10, 13, 11},
//                      {12, 0, 14, 15}}
//         sum = 11
// Output: (1, 10), (3, 8), (2, 9), (4, 7), (11, 0)

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class MatrixPairSumWithHashMap {
    // Method to find all the pair with the given sum from different row
    public static List<String> FindPairWithSum(int[][] mat, int targetSum) {
        List<String> result = new ArrayList<>();
        HashMap<Integer, Integer> Map = new HashMap<>();
        // to store the element from the previous rows
        int row = mat.length;
        int cols = mat[0].length;

        // Iterate over each rows

        for (int i = 0; i < row; i++) {
            // for each element in the current row,check if the complement exists in the map

            for (int j = 0; j < cols; j++) {
                int element = mat[i][j];
                int complement = targetSum - element;

                // if the complement exists in the map , add their pair to result

                if (Map.containsKey(complement)) {
                    result.add("(" + complement + "," + element + ")");
                }
            }
            for (int j = 0; j < cols; j++) {
                Map.put(mat[i][j], 1);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4 },
                { 5, 8, 7, 6 },
                { 9, 10, 13, 11 },
                { 12, 0, 14, 15 }
        };
        int sum = 15;

        List<String> pairs = FindPairWithSum(mat, sum);
        System.out.println("Pair with the sum " + sum + ":" + pairs);
    }

}
