import java.util.HashSet;
import java.util.Set;

class Solution387 {
    public int firstUniqChar(String s) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        char[] array = s.toCharArray();
        for(int i = 0; i < array.length; i++){
            if (!set1.contains(array[i])){
                set1.add(array[i]);
            }
            else{
                set2.add(array[i]);
            }
        }
        for (int i = 0; i < array.length; i++){
            if (!set2.contains(array[i])) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "abcdabecd";
        Solution387 solution387 = new Solution387();
        System.out.println(solution387.firstUniqChar(str));
    }
}