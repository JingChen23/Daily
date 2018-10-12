class Solution387 {
    public int firstUniqChar(String s) {
        int len = s.length();
        int lowest = len;

        for (char i = 'a'; i <= 'z'; i++)   {
            int first = s.indexOf(i);
            if (first >= 0) {
                if (lowest > first && s.lastIndexOf(i) == first)  {
                    lowest = first;
                }
            }
        }
        return lowest == len ? -1 : lowest;
    }

    public static void main(String[] args) {
        String str = "abcdabecd";
        Solution387 solution387 = new Solution387();
        System.out.println(solution387.firstUniqChar(str));
    }
}