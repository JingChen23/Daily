public class Solution8 {

    public int myAtoi(String str) {

        boolean[] dic = new boolean[256];

        for (int i = 0; i < 10; i++){
            dic['0'+ i] = true;
        }

        char[] charArray = str.toCharArray();

        int index = 0;
        int result = 0;
        boolean negative = false;

        while (index < charArray.length){
            if(charArray[index] == ' ') {
                index++;
                continue;
            }
            if(charArray[index] == '-'){
                negative = true;
                index++;
            }
            else if(charArray[index] == '+')
                index++;
//            index++;
            break;
        }

        while (index < charArray.length){
            if(charArray[index] == ' ') break;
            if (!dic[charArray[index]]) break;
            int newNum = charArray[index] - '0';
            if (!negative && (result > Integer.MAX_VALUE/10 || result == Integer.MAX_VALUE/10 && newNum > 7 )) return Integer.MAX_VALUE;
            if (negative && (result > Integer.MAX_VALUE/10 || result == Integer.MAX_VALUE/10 && newNum > 8 )) return Integer.MIN_VALUE;
            result *= 10;
            result += newNum;
            index ++;
        }
        if (negative) result = -result;
        return result;
    }

    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
//        System.out.println(Integer.MAX_VALUE);
        String str = "000000000000000000000000000000000001";
        System.out.println(solution8.myAtoi(str));
    }
}
