import java.util.Scanner;

public class MatrixOperations {

    // Method to create a matrix from user input
    public static int[][] createMatrixFromInput(int rows, int cols) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter values for a " + rows + "x" + cols + " matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value for element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        // Check if multiplication is possible
        if (cols1 != rows2) {
            throw new IllegalArgumentException("Matrix dimensions do not match for multiplication.");
        }

        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        throw new IllegalArgumentException("Matrix is not 2x2.");
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        if (matrix.length == 3 && matrix[0].length == 3) {
            return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                    - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                    + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        }
        throw new IllegalArgumentException("Matrix is not 3x3.");
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        if (determinant == 0) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted.");
        }
        double[][] result = new double[2][2];
        result[0][0] = matrix[1][1] / (double) determinant;
        result[0][1] = -matrix[0][1] / (double) determinant;
        result[1][0] = -matrix[1][0] / (double) determinant;
        result[1][1] = matrix[0][0] / (double) determinant;
        return result;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int determinant = determinant3x3(matrix);
        if (determinant == 0) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted.");
        }
        double[][] result = new double[3][3];
        result[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / (double) determinant;
        result[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / (double) determinant;
        result[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / (double) determinant;
        result[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / (double) determinant;
        result[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / (double) determinant;
        result[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / (double) determinant;
        result[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / (double) determinant;
        result[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / (double) determinant;
        result[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / (double) determinant;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for matrices
        System.out.print("Enter the number of rows for matrix 1: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter the number of columns for matrix 1: ");
        int cols1 = sc.nextInt();
        int[][] matrix1 = createMatrixFromInput(rows1, cols1);

        System.out.print("Enter the number of rows for matrix 2: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter the number of columns for matrix 2: ");
        int cols2 = sc.nextInt();
        int[][] matrix2 = createMatrixFromInput(rows2, cols2);

        System.out.println("\nMatrix 1:");
        displayMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        // Perform matrix operations
        if (rows1 == rows2 && cols1 == cols2) {
            System.out.println("\nMatrix Addition:");
            displayMatrix(addMatrices(matrix1, matrix2));

            System.out.println("\nMatrix Subtraction:");
            displayMatrix(subtractMatrices(matrix1, matrix2));
        }

        if (cols1 == rows2) {
            System.out.println("\nMatrix Multiplication:");
            displayMatrix(multiplyMatrices(matrix1, matrix2));
        }

        System.out.println("\nTranspose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));

        if (rows1 == 2 && cols1 == 2) {
            System.out.println("\nDeterminant of Matrix 1 (2x2): " + determinant2x2(matrix1));
            System.out.println("\nInverse of Matrix 1 (2x2):");
            double[][] inverseMatrix = inverse2x2(matrix1);
            for (int i = 0; i < inverseMatrix.length; i++) {
                for (int j = 0; j < inverseMatrix[i].length; j++) {
                    System.out.print(inverseMatrix[i][j] + "\t");
                }
                System.out.println();
            }
        }

        if (rows1 == 3 && cols1 == 3) {
            System.out.println("\nDeterminant of Matrix 1 (3x3): " + determinant3x3(matrix1));
            System.out.println("\nInverse of Matrix 1 (3x3):");
            double[][] inverseMatrix = inverse3x3(matrix1);
            for (int i = 0; i < inverseMatrix.length; i++) {
                for (int j = 0; j < inverseMatrix[i].length; j++) {
                    System.out.print(inverseMatrix[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
