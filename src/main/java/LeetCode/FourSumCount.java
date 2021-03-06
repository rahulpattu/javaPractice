package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int aC : C) {
            for (int aD : D) {
                int sum = aC + aD;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int numSolutions = 0;

        for (int aA : A) {
            for (int aB : B) {
                numSolutions += map.getOrDefault(-1 * (aA + aB), 0);
            }
        }

        return numSolutions;
    }

}
