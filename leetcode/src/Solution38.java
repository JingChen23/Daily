public class Solution38 {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        if (n == 2) return fuck("1");
        return fuck(countAndSay(n-1));
    }

    public String fuck (String string){
        char[] chars = string.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        int index = 0;
        char temp = chars[0];
        int count = 0;
        while (index < chars.length){
            if (chars[index] != temp){
                stringBuffer.append(count);
                stringBuffer.append(temp);
                temp = chars[index];
                count = 1;
            }
            else{
                count ++;
            }
            index++;
        }
        stringBuffer.append(count);
        stringBuffer.append(temp);
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Solution38 solution38 = new Solution38();
        System.out.println(solution38.countAndSay(7));
    }
}
