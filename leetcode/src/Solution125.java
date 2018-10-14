class Solution125 {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int i = 0;
        int j = charArray.length-1;
        while (i < j){
            while (!isAlphaNumeric(charArray[i]) && i < j) i++;
            while (!isAlphaNumeric(charArray[j]) && i < j) j--;
            if (!equanlsIgnoreCase(charArray[i], charArray[j])) return false;
            i++;
            j--;
        }
        return true;
    }

    public boolean isAlphaNumeric (char c){
        if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9'){
            return true;
        }
        return false;
    }

    public boolean equanlsIgnoreCase(char a, char b){
        if (a == b) return true;
        if ((a-b == 32 || b-a == 32)) return true;
        return false;
    }

    public static void main(String[] args) {
        Solution125 solution125 = new Solution125();
        System.out.println(solution125.isPalindrome("0P"));
    }
}