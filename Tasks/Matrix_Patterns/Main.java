package Tasks.Matrix_Patterns;

public class Main {
    public static void main(String[] args) {
        int n = 10;

        MatrixPattern snailPat = new SnailMatrix();
        int[][] snailMat = snailPat.generate(n);
        System.out.println("Snail:");
        MatrixPrinter.printMatrix(snailMat);

        MatrixPattern fenPat = new FenceMatrix();
        int[][] fenMat = fenPat.generate(n);
        System.out.println("Fence:");
        MatrixPrinter.printMatrix(fenMat);

        MatrixPattern clockPat = new ClockMatrix();
        int[][] clockMat = clockPat.generate(n);
        System.out.println("Clock:");
        MatrixPrinter.printMatrix(clockMat);
    }
}
