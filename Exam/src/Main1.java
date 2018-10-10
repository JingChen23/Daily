// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String>[] listArray = new List[101];
        for (int i = 0; i< listArray.length;i++){
            listArray[i] = new LinkedList<>();
        }
        while (in.hasNextLine()) {//注意while处理多个case
            String name = in.next();
            int score = 0;
            int count = 0;
            while (in.hasNextInt()) {
                score += in.nextInt();
                count++;
            }
            double temp = (double)score / (double)count;
            score = (int)(temp+0.5);
            listArray[score].add(name);

        }
        for (int i = 100; i >= 0; i--) {
            if (!listArray[i].isEmpty() ) {
                for (String str : listArray[i]) {
                    System.out.println(str + ' ' + i);
                }
            }
        }

    }
}