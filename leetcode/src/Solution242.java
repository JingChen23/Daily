class Solution242 {
    public boolean isAnagram(String s, String t) {
        int[] times = new int[26];
        for (char c : s.toCharArray()){
            times[c-'a'] ++;
        }
        for (char c : t.toCharArray()){
            times[c-'a'] --;
        }
        for (int i : times){
            if (i != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cat";
        String t = "tacb";
        Solution242 solution242 = new Solution242();
        System.out.println(solution242.isAnagram(s,t));
    }
}