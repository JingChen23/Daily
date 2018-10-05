import java.util.HashMap;
import java.util.Map;

public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, Integer> mapOrigin = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            mapOrigin.put((char) ('1' + i), 1);
        }

        Map<Character, Integer> map1;
        for(int i = 0; i < 9; i++){
            map1 = new HashMap<>(mapOrigin);
            for (int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                else{
                    if (map1.get(board[i][j]) == 1) map1.put(board[i][j], 0);
                    else return false;
                }
            }
        }

        for(int i = 0; i < 9; i++){
            map1 = new HashMap<>(mapOrigin);
            for (int j = 0; j < 9; j++){
                if(board[j][i] == '.') continue;
                else{
                    if (map1.get(board[j][i]) == 1) map1.put(board[j][i], 0);
                    else return false;
                }
            }
        }


        for(int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j+=3) {
                map1 = new HashMap<>(mapOrigin);
                for (int k = i; k < i+3 ; k++){
                    for (int m = j; m < j + 3; m++){
                        if(board[k][m] == '.') continue;
                        else{
                            if (map1.get(board[k][m]) == 1) map1.put(board[k][m], 0);
                            else return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
