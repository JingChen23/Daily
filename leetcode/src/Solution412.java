import java.util.LinkedList;
import java.util.List;

public class Solution412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<>();
        for (int num = 1 ; num <= n ; num++){
            StringBuilder stringBuilder = new StringBuilder();
            if (num%3 == 0){
                stringBuilder.append("Fizz");
            }
            if (num%5 == 0){
                stringBuilder.append("Buzz");
            }
            if (stringBuilder.length() == 0){
                stringBuilder.append(num);
            }
            list.add(stringBuilder.toString());
        }
        return list;
    }

    public static void main(String[] args) {
        Solution412 solution412 = new Solution412();
        System.out.println(solution412.fizzBuzz(20).toString());
    }
}