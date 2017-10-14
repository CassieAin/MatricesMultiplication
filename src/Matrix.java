import java.util.Random;

public class Matrix{
    private int[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols, int[][] matrix){
        this.rows = rows;
        this.cols = cols;
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

}
