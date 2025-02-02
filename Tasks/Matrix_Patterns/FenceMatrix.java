package Tasks.Matrix_Patterns;

public class FenceMatrix implements MatrixPattern {
    @Override
    public int[][] generate(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            int diff = Math.min(i, n - 1 - i);
            for (int j = 0; j < n; j++) {
                if (j < diff || j >= n - diff) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }
}
