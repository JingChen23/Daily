import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(target-nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            Integer j = map.get(nums[i]);
            if (j != null && j!= i){
                return new int[] {i, map.get(nums[i])};
            }
        }

        return new int[2];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int target = 6;

        Solution1 solution1 = new Solution1();
        int[] res = solution1.twoSum(nums, target);
        System.out.println(Arrays.toString(res));

    }
}
