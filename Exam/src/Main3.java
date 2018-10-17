import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            int target = in.nextInt();

            Map<Integer, Integer> map = new HashMap<>();

            int[] moneys = new int[num];
            int[] nums = new int[num];


            for (int i = 0; i < num; i++) {
                moneys[i] = in.nextInt();
            }
            for (int i = 0; i < num; i++) {
                nums[i] = in.nextInt();
            }
            for (int i = 0; i < num; i++) {
                map.put(moneys[i], nums[i]);
            }
            Arrays.sort(moneys);

            int index = moneys.length - 1;

            int count = 0;
            while (index >= 0) {
                while (map.get(moneys[index]) > 0 && (target - moneys[index]) >= 0) {
                    target -= moneys[index];
                    count++;
                    if (target == 0)  break;
                    map.put(moneys[index], map.get(moneys[index]) - 1);
                }
                if (target == 0) break;
                index--;
            }
            System.out.println(count);
        }
    }
}
