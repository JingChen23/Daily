import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfTasks = in.nextInt();
        int[] tasks = new int[numOfTasks];
        for (int i = 0; i < numOfTasks; i++) {
            tasks[i] = in.nextInt();
        }

        System.out.println(solver(numOfTasks, tasks));

    }
    public static int solver (int numOfTasks, int[] tasks){
        int length = tasks.length;
        if (length == 0) return 0;
        if (numOfTasks == 1) return tasks[0];
        if (numOfTasks == 2) return Math.max(tasks[0],tasks[1]);
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Arrays.sort(tasks);
        stack1.push(tasks[length-1]);
        stack2.push(tasks[length-2]);
        for (int i = length-3; i >= 0; i--){
            if (stack1.peek() > stack2.peek()){
                stack2.push(stack2.peek() + tasks[i]);
            }
            else{
                stack1.push(stack1.peek() + tasks[i]);
            }
        }
        return Math.max(stack1.peek(), stack2.peek());
    }
}
