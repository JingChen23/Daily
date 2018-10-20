import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startNum = in.nextInt();
        int goalNum = in.nextInt();
        int gap = startNum - goalNum;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < startNum; i++){
            list.add(in.nextInt());
        }
        int index = 0;
        while (index < gap){
            int minIndex = 0;
            int minPile =Integer.MAX_VALUE;
            for (int i = 0; i < list.size()-1; i++){
                int temp = list.get(i) + list.get(i+1);
                if (temp < minPile){
                    minPile = temp;
                    minIndex = i;
                }
            }
            list.remove(minIndex+1);
            list.remove(minIndex);
            list.add(minIndex,minPile);
            index++;
        }
        int minMax = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) > minMax){
                minMax = list.get(i);
            }
        }
        System.out.println(list.toString());
        System.out.println(minMax);
    }
}
