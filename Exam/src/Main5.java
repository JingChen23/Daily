import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Number[] numbers = new Number[n];
        for (int i = 0; i < n; i ++){
            numbers[i] = new Number(in.nextInt());
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n ; i++){
            stringBuilder.append(Integer.toString(numbers[i].num));
        }
        String temp = stringBuilder.toString();
        System.out.println(temp);
    }
}

class Number implements Comparable{
    public int num;
    public Number(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return Integer.toString(num);
    }

    @Override
    public int compareTo(Object o) {
        String s1 = this.toString();
        String s2 = o.toString();
        int a = Integer.parseInt(s1+s2);
        int b = Integer.parseInt(s2+s1);
        if(a < b) return -1;
        else if (a>b) return 1;
        else return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return this.compareTo(obj)==0?true:false;
    }
}

