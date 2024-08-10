package Day1;

public class setMatrixZeros {
    public void setZeroes(int[][] matrix) {
        int[][] check = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < check.length ; i++){
            for (int j = 0; j < check[0].length; j++) {
                check[i][j] = matrix[i][j];
            }
        }
        for(int i = 0; i < check.length ; i++){
            for (int j = 0; j < check[0].length; j++) {
                if(check[i][j] == 0){
                    convert(matrix, i ,j);
                }
            }
        }
    }

    private void convert(int[][] matrix, int row, int col) {
        for(int i = 0; i < col ; i++){
            matrix[row][i] = 0;
        }
        for(int i = col; i < matrix[0].length; i++){
            matrix[row][i] = 0;
        }
        for (int i = 0 ; i < row ; i++){
            matrix[i][col] = 0;
        }
        for (int i = row ; i < matrix.length ; i++)
            matrix[i][col] = 0;
    }
}
