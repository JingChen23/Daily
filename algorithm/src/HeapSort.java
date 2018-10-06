import java.util.*;

public class HeapSort {

    public int[] sort (int[] nums){
//        make a heap
//        when you build up a heap, you should always put the new coming element at the end of the heap.
//        and you track the last element
        int[] alterNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            alterNums[i] = nums[i];
            for(int j = i; j > 0;){
                int parent = (j-1)/2;
                int largerIndex = j;
                if (j % 2 == 0) {
                    largerIndex = (alterNums[j-1] > alterNums[j])?j-1:j;
                }
                else {
                    if (j != i){
                        largerIndex = (alterNums[j+1] > alterNums[j])?j+1:j;
                    }
                }
                if (alterNums[largerIndex] > alterNums[parent]) {
                    swap(alterNums, largerIndex, parent);
                    j = parent;
                }
                else
                    break;
            }
        }

        for (int i = alterNums.length-1; i >= 0; i--){
            swap(alterNums, i, 0);
            for (int j = 0; j < i; ) {
                int left = 2*j+1;
                int right = 2*j+2;
                if (left > i-1) {
                    break;
                }
                else if (left == i-1){
                    if (alterNums[left] > alterNums[j]){
                        swap(alterNums, j ,left);
                    }
                    break;
                }
                else {
                    int largerIndex = (alterNums[left] > alterNums[right])?left:right;
                    if (alterNums[j] < alterNums[largerIndex]){
                        swap(alterNums, j ,largerIndex);
                        j = largerIndex;
                    }
                    else break;
                }
            }
        }
        return alterNums;
    }

    public void swap (int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[20];
        for (int i = 0; i < 20; i++){
            int random = (int)(1000* Math.random());
            nums[i] = random;
        }
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

}


