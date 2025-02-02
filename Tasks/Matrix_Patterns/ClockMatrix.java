package Tasks.Matrix_Patterns;

public class ClockMatrix implements MatrixPattern {
    @Override
    public int[][] generate(int n) {
        int[][] matrix = new int[n][n];
        int layers = (n + 1) / 2;

        for (int layer = 0; layer < layers; layer++) {
            int value = 1 - (layer % 2);
            for (int i = layer; i < n - layer; i++) {
                matrix[layer][i] = value;
                matrix[n - layer - 1][i] = value;
                matrix[i][layer] = value;
                matrix[i][n - layer - 1] = value;
            }
        }
        return matrix;
    }
}
