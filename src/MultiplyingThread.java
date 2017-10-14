public class MultiplyingThread implements Runnable{
    private final SquareMatrices matrices;

    public MultiplyingThread(SquareMatrices matrices){
        this.matrices = matrices;
    }

    /**
     * Printing the result of matrices multiplication
     */
    public void run(){
        matrices.getMultiplicationResult();
    }
}
