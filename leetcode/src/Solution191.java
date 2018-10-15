public class Solution191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if(n<0) return 0;
        int res = 0;
        int temp = 1;
        for (int i = 0 ; i < 32; i++){
            if ((temp & n) != 0) res ++;
            n = n >>> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution191 solution191 = new Solution191();
        System.out.println(solution191.hammingWeight(3));
    }
}
