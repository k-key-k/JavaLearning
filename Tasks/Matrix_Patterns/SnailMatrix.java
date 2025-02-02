package Tasks.Matrix_Patterns;

public class SnailMatrix implements MatrixPattern {
    @Override
    public int[][] generate(int n) {
        int[][] matrix = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int tempLeft = 0;
        while (left <= right && top <= bottom) {
            for (int i = tempLeft; i < right; i++) matrix[top][i] = 1;

            for (int i = top; i < bottom; i++) matrix[i][right] = 1;

            for (int i = right; i > left; i--) matrix[bottom][i] = 1;
            top += 2;
            right -= 2;

            for (int i = bottom; i > top; i--) matrix[i][left] = 1;
            bottom -= 2;
            left += 2;
        }
        return matrix;
    }
}
