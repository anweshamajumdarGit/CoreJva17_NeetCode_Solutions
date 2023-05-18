import java.util.HashMap;
import java.util.Map;

public class TwoSumBetterSolution {
    public static void main(String[] args) {
        int[] numbers = { 3, 4, 5, 6 };
        int targetSum = 7;
        SolutionWithMap sm = new SolutionWithMap();
        int[] values = sm.solution(numbers, targetSum);
        for (int value : values) {
            System.out.println(value);
        }
    }
}

class SolutionWithMap {
    public int[] solution(int[] numbers, int targetValue) {
        Map<Integer, Integer> numBucket = new HashMap<>();
        for (int i = 0; i <= numbers.length; i++) {
            int diff = targetValue - numbers[i];
            if (numBucket.containsKey(diff)) {
                return new int[] { numBucket.get(diff),i };
            }
            numBucket.put(numbers[i], i);
        }
        return numbers;
    }
}