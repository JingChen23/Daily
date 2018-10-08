public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && ((n & (n-1)) == 0);
    }
    public static void main(String[] args) {
        Solution231 solution231 = new Solution231();
        System.out.println(solution231.isPowerOfTwo(64));
    }
}
