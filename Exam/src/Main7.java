import java.util.Scanner;

public class Main7{

    public static int columnNum = 0;

    public static int rowNum = 0;

    public static int[][] map;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        columnNum = in.nextInt();
        rowNum = in.nextInt();

        map = new int[rowNum][columnNum];
        for (int i = 0 ; i < rowNum; i++){
            for (int j = 0; j < columnNum; j++) {
                map[i][j] = in.nextInt();
            }
        }

//        if (map[0][0] == -1) System.out.println(-1);

        for (int i = 1; i < columnNum; i++){
            if (map[0][i-1] <= 0) map[0][i] = -1;
            else map[0][i] += map[0][i-1];
        }

        for (int j = 1; j < rowNum; j++){
            if (map[j-1][0] <= 0) map[j][0] = -1;
            else map[j][0] += map[j-1][0];
        }

//        System.out.println(Arrays.deepToString(map));

        int curRow = 1;
        while (curRow < rowNum){
            for (int curCol = 1; curCol < columnNum; curCol++){
                if (map[curRow][curCol-1] < 0 && map[curRow-1][curCol] < 0){
                    map[curRow][curCol] = -1;
                }
                else
                    map[curRow][curCol] += Math.max(map[curRow][curCol-1],map[curRow-1][curCol]);
            }
            curRow++;
        }
        if (map[rowNum-1][columnNum-1] < 0) map[rowNum-1][columnNum-1] = -1;
        System.out.println(map[rowNum-1][columnNum-1]);
    }



}