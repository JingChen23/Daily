import java.util.*;
public class HeapSort {
    public int[] sort (int[] nums){
        for (int i = 0; i < nums.length; i++){
            int j = i;
            int parent = (j-1)/2;
            while (j>0 && nums[j] > nums[parent]){
                swap(nums, j, parent);
                j = parent;
                parent = (j-1)/2;
            }
        }
        for (int limit = nums.length-1; limit >= 0; limit--){
            swap(nums, limit, 0);
            int parent = 0;
            while (parent < limit) {
                int left = 2*parent+1;
                if (left >= limit) {
                    break;
                }
                int right = (left + 1) >= limit ? left : (left + 1);
                int largerIndex = (nums[left] > nums[right]) ? left : right;
                if (nums[parent] < nums[largerIndex]) {
                    swap(nums, parent, largerIndex);
                    parent = largerIndex;
                }
                else break;
            }
        }
        return nums;
    }
    public void swap (int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {4,3,6,1,2,12,8,5};
//        int[] nums = new int[20];
//        for (int i = 0; i < 20; i++){
//            int random = (int)(1000* Math.random());
//            nums[i] = random;
//        }
        System.out.println(Arrays.toString(nums));

        Long time = System.currentTimeMillis();
        System.out.println("start time:    "   +time);

        HeapSort heapSort = new HeapSort();
        System.out.println(Arrays.toString(heapSort.sort(nums)));
        Long time1 = System.currentTimeMillis();
        System.out.println("real heap sort spends:"   + (time1 -time));

        FakeHeapSort fakeHeapSort = new FakeHeapSort();
        System.out.println(Arrays.toString(fakeHeapSort.sort(nums)));
        Long time2 = System.currentTimeMillis() - time1;
        System.out.println("fake heap sort spends:"   +time2);

//        System.out.println(Arrays.toString(heapSort.sort(nums)));
//        System.out.println(Arrays.toString(fakeHeapSort.sort(nums)));
    }
//        make a heap
//        when you build up a heap, you should always put the new coming element at the end of the heap.
//        and you track the last element

}


