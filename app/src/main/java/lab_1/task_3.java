package lab_1;

public class task_3 {
    static int[][] multiplyMatrices(int[][] A, int[][] B, int n) {
        int[][] X = new int[n][n];
        for (int i = 0; i < n; i++) {
            int maxInB = findMaxInRow(B[i]);
            for (int j = 0; j < n; j++) {
                X[i][j] = A[i][j] * maxInB;
            }
        }
        return X;
    }

    static int findMaxInRow(int[] row) {
        int max = row[0];
        for (int i = 1; i < row.length; i++) {
            if (row[i] > max) {
                max = row[i];
            }
        }
        return max;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%4d ", element);
            }
            System.out.println();
        }
    }

    public static void main() {
        int n = 3;
        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] B = {
                { 1, 8, 7 },
                { 4, 2, 9 },
                { 6, 5, 3 }
        };
        int[][] X = multiplyMatrices(A, B, n);

        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("\nMatrix B:");
        printMatrix(B);

        System.out.println("\nResult Matrix X:");
        printMatrix(X);
    }
}
/*
    Задано дві матриці A(n,n) і B(n,n), n<=15.
    Розробити програму, яка будує матрицю X(n,n),
    множенням елементів кожного рядка першої матриці на найбільше із значень елементів відповідного рядка другої матриці.
*/