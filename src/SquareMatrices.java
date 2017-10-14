import java.util.Random;

public class SquareMatrices {
    private Matrix matrix_a;
    private Matrix matrix_b;

    public SquareMatrices(Matrix matrix_a, Matrix matrix_b){
        this.matrix_a = matrix_a;
        this.matrix_b = matrix_b;
    }

    /**
     * Creation of the matrix filled with zeroes
     * @param n - number of rows
     * @param m - number of columns
     * @return
     */
    private int[][] zeroMatrix(int n, int m){
        int[][] matrix = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = 0;
            }
        }
        return matrix;
    }

    /**
     * Multiplication of 2 square matrices and storing the result into a zero matrix
     * @return matrix as the result of multiplication
     */
    private synchronized int[][] multiplyMatrices(){
        int a_rows = matrix_a.getRows();
        int a_cols = matrix_a.getCols();
        int b_rows = matrix_b.getRows();
        int b_cols = matrix_b.getCols();

        int[][] c = zeroMatrix(a_rows, b_rows);
        for(int i = 0; i < a_rows; i++){
            for(int j = 0; j < b_cols; j++) {
                for(int k = 0; k < a_cols; k++) {
                    c[i][j] += matrix_a.getMatrix()[i][k] * matrix_b.getMatrix()[k][j];
                }
            }
        }
        return c;
    }

    /**
     * Wrapper method which prints the matrix
     * resulted from the multiplication of 2 square matrices
     */
    public synchronized void getMultiplicationResult(){
        MatrixManipulation manipulation = new MatrixManipulation();
        manipulation.printMatrix(multiplyMatrices());
    }
}
