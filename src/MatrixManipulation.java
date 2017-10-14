import java.util.Random;

public class MatrixManipulation {

    /**
     * Filling new matrix with random numbers in the range of 10
     * @param rows - number of rows
     * @param cols - number of columns
     * @return filled matrix
     */
    public int[][] randomMatrix(int rows, int cols){
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    /**
     * Printing given matrix element by element
     * @param matrix
     */
    public void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
