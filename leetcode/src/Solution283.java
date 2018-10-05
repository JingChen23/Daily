import java.util.Arrays;

public class Solution283 {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                swap(nums, i , j);
                j++;
            }
        }
    }

    public void swap (int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{0,1,2,0,2,0};
        System.out.println(Arrays.toString(nums));
        Solution283 solution283 = new Solution283();
        solution283.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }
}
