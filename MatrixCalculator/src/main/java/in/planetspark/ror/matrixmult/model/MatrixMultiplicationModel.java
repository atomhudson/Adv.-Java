package in.planetspark.ror.matrixmult.model;

public class MatrixMultiplicationModel {
    private int[][] resultMatrix;
    private int[][] matrixA;
    private int[][] matrixB;
    public MatrixMultiplicationModel() {
        // Default constructor
    }

    public int[][] getResultMatrix() {
        return resultMatrix;
    }

    public void setResultMatrix(int[][] resultMatrix) {
        this.resultMatrix = resultMatrix;
    }

    public int[][] getMatrixB() {
        return matrixB;
    }

    public void setMatrixB(int[][] matrixB) {
        this.matrixB = matrixB;
    }
    
    public int[][] getMatrixA() {
        return matrixA;
    }

    public void setMatrixA(int[][] matrixA) {
        this.matrixA = matrixA;
    }
}
