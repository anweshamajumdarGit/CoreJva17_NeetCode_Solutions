public class NeetcodeTwoSum {
    public static void main(String[] args) {
        System.out.println("two sum problem");
        TwoSumSolution ts = new TwoSumSolution();
        int[] numbers = { 3, 4, 5, 6 };
        int targetSum = 10;
        int[] values=ts.solution(numbers, targetSum);
        for(int value:values){
            System.out.println(value);
        }
        

    }
}

class TwoSumSolution {
    public int[] solution(int[] numbers, int targetSum) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    return new int[] { i, j };
                }
            }
        }

        return numbers;
    }
}
