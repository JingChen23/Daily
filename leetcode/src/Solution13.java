class Solution13 {

    public int romanToInt(String s) {
        if(s.length() == 0) {
            return 0;
        }
        char[] string = s.toCharArray();
        int[] numForm = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            if(string[i] == 'I') {
                numForm[i] = 1;
            }
            else if(string[i] == 'V') {
                numForm[i] = 5;
            }
            else if(string[i] == 'X') {
                numForm[i] = 10;
            }
            else if(string[i] == 'L') {
                numForm[i] = 50;
            }
            else if(string[i] == 'C') {
                numForm[i] = 100;
            }
            else if(string[i] == 'D') {
                numForm[i] = 500;
            }
            else {
                numForm[i] = 1000;
            }
        }
        int number = 0;
        for(int i = 0; i < numForm.length; i++) {
            if(i + 1 < numForm.length && numForm[i + 1] > numForm[i]) {
                numForm[i] *= -1;
            }
            number += numForm[i];
        }
        return number;
    }
}