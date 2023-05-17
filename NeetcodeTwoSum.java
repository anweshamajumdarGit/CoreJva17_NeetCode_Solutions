import java.util.HashMap;

public class NeetcodeTwoSum {
    public static void main(String[] args) {
        System.out.println("two sum problem");
        TwoSumSolution ts=new TwoSumSolution();
        int[] numbers={3,4,5,6};
        int targetSum=11;
        try {
            ts.solution(numbers,targetSum);
            throw new IllegalArgumentException("No two numbers add up to the target.");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
}
class TwoSumSolution{
    public int[] solution(int[] numbers,int targetSum){

    HashMap<Integer, Integer> prevMap = new HashMap<>();
    int length=numbers.length;
    for(int i=0;i<length;i++){

        int num=numbers[i];
        int diff = targetSum - num;
        if (prevMap.containsKey(diff)) {
            System.out.println(prevMap.get(diff));
            System.out.println(i);
            return new int[] { prevMap.get(diff), i };
            
        }
        prevMap.put(num, i);
    }
    return new int[] {};
    }
}


