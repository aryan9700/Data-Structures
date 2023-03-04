import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum {
    public static void main(String[] args) {
        int[] nums=new int[]{2,3,7,4,8};
        int target=7;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> visitednumbers=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int delta=target-nums[i];
            if(visitednumbers.containsKey(delta)){
                return new int[] {i,visitednumbers.get(delta)};

            }visitednumbers.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }

}
