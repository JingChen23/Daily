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

        int result = computeCoins(0, 0, 0);

        System.out.println(result);
    }

    public static int computeCoins (int x, int y, int coins){
        if (x >= rowNum || y >= columnNum) return -1;
        int thisStep = map[x][y];
        if (x == rowNum-1 && y == columnNum -1) return (coins + thisStep);
        if (thisStep == 0 || thisStep < 0 && coins + thisStep < 0) return -1;
        int down = computeCoins(x+1, y, coins + thisStep);
        int right = computeCoins(x, y+1, coins + thisStep);
        return (down > right)? down : right;
    }

}