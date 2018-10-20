import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0) return list;
        List<Integer> first = new ArrayList<>();
        first.add(1);
        list.add(first);
        int row = 2;
        while (row < numRows+1){
            Integer[] temp = new Integer[row];
            temp[0] = 1;
            temp[temp.length-1] = 1;
            List<Integer> lastLayer = list.get(list.size()-1);
            for (int i = 1; i < temp.length-1; i++){
                temp[i] = lastLayer.get(i-1)+lastLayer.get(i);
            }
            List<Integer> thisLayer = new ArrayList<>(temp.length);
            list.add(thisLayer);
            Collections.addAll(thisLayer, temp);
            row++;
        }
        return list;
    }

    public static void main(String[] args) {
        int numRows = 0;
        Solution118 solution118 = new Solution118();
        for (List list : solution118.generate(numRows)){
            System.out.println(list.toString());
        }
    }
}
