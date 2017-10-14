import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMain {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number of rows and columns for the 1st matrix: ");
        int a_rows = scanner.nextInt();
        int a_cols = a_rows;
        System.out.println("Input the number of rows and columns for the 2nd matrix: ");
        int b_rows = scanner.nextInt();
        int b_cols = b_rows;

        if(a_cols != b_rows){
            System.out.println("\nCan not multiply matrices, because the number of columns of the 1st matrix" +
                                 " do not equal to the number of the second one");
            System.exit(0);
        }

        MatrixManipulation impl = new MatrixManipulation();
        int[][] random_a = impl.randomMatrix(a_rows, a_cols);
        int[][] random_b = impl.randomMatrix(b_rows, b_cols);

        Matrix matrix_a = new Matrix(a_rows, a_cols, random_a);
        Matrix matrix_b = new Matrix(b_rows, b_cols, random_b);

        System.out.println("Matrix a: ");
        impl.printMatrix(matrix_a.getMatrix());
        System.out.println("Matrix b: ");
        impl.printMatrix(matrix_b.getMatrix());
        SquareMatrices matrices = new SquareMatrices(matrix_a, matrix_b);

        System.out.println("Input the number of threads to be run: ");
        int numberOfThreads = scanner.nextInt();

        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        for(int i = 0; i < numberOfThreads; i++){
            Runnable worker = new Thread(new MultiplyingThread(matrices));
            System.out.println("\nExecuted by thread: " + i);
            executor.execute(worker);
        }
        executor.shutdown();
    }
}

