import java.util.Arrays;

public class Solution48 {

    public void rotate(int[][] matrix) {

        int start = 0;
        int l = matrix.length;
        int end = l/2;
        for(int i = start ; i < end; i++){
            for (int j = i ; j < l-i-1; j++){
                swap4(matrix, i , j);
            }
        }
    }

    public void swap4 (int[][] matrix, int i, int j){
        int l =matrix.length;
        int temp = matrix[i][j];
        matrix[i][j] = matrix[l-j-1][i];
        matrix[l-j-1][i] = matrix[l-i-1][l-j-1];
        matrix[l-i-1][l-j-1] = matrix[j][l-i-1];
        matrix[j][l-i-1] = temp;
    }

    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        Solution48 solution48 = new Solution48();
        solution48.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
