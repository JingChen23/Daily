public class Solution28 {

    public int strStr(String haystack, String needle) {

        if (needle.equals("")) return 0;

        if (needle.length() > haystack.length()) return -1;

        if (!haystack.contains(needle)) return -1;

        for (int i = 0 ; i < haystack.length(); i++){

            if (haystack.charAt(i) == needle.charAt(0)){

                if (haystack.substring(i, i+needle.length()).equals(needle)){

                    return i;

                }

            }

        }

        return -1;
    }

    public static void main(String[] args) {

        String haystack = "aadbc";

        String needle = "bc";

        Solution28 solution28 = new Solution28();

        System.out.println(solution28.strStr(haystack, needle));

    }

}
