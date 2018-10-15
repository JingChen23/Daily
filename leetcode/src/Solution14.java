public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int min = Integer.MAX_VALUE;
        for (String string : strs){
            if (string.length() < min) min = string.length();
        }
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < min; i++){
            char temp = strs[0].charAt(i);
            for (String string : strs){
                if (string.charAt(i) != temp) return result.toString();
            }
            result.append(temp);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        String[] strings = {"aaower", "flow","flight"};
        System.out.println(solution14.longestCommonPrefix(strings));
    }
}
