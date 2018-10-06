public class FakeHeapSort {
    public int[] sort(int[] arr){
        for(int i = arr.length; i > 0; i--){
            max_heapify(arr, i);

            int temp = arr[0];      //堆顶元素(第一个元素)与Kn交换
            arr[0] = arr[i-1];
            arr[i-1] = temp;

        }
        return arr;

    }

    private void max_heapify(int[] arr, int limit){
        if(arr.length <= 0 || arr.length < limit) return;
        int parentIdx = (limit-1) / 2;

        for(; parentIdx >= 0; parentIdx--){
            int left = parentIdx * 2 + 1;
            if(left >= limit){
                continue;
            }
                   //左子节点位置
            int right = (left + 1) >= limit ? left : (left + 1);    //右子节点位置，如果没有右节点，默认为左节点位置
            int maxChildId = arr[left] >= arr[right] ? left : right;
            if(arr[maxChildId] > arr[parentIdx]){   //交换父节点与左右子节点中的最大值
                int temp = arr[parentIdx];
                arr[parentIdx] = arr[maxChildId];
                arr[maxChildId] = temp;
            }
        }
    }
}
