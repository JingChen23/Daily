public class Solution326 {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        int maxPower = (int) Math.pow(3,(int)(Math.log(0x7fffffff)/Math.log(3)));
        return (maxPower%n == 0)?true:false;
    }

    public static void main(String[] args) {
        Solution326 solution326 = new Solution326();
        System.out.println(solution326.isPowerOfThree(99));
    }
}
