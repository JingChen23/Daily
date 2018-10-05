import java.util.Arrays;

public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length -1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    int[] res = new int[2];
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
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
