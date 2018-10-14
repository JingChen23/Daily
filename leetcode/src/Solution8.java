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
            }
            index++;
            break;
        }

        while (index < charArray.length){
            if(index == ' ') break;
            if (!dic[charArray[index]]) break;
            result *= 10;
            result += charArray[index] - '0';
            index ++;
        }
        if (negative) result = -result;
        return result;

    }

    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        String str = "-123";
        System.out.println(solution8.myAtoi(str));
    }
}
