package recursividade01;

public class PerfectSquareUtil {

    // Método público para verificar se o número é um quadrado perfeito
    public static boolean isPerfectSquare(double n) {
        if (n < 0) {
            return false;
        }
        return isPerfectSquareHelper(n, 0);
    }

    // Método recursivo auxiliar para verificar o quadrado perfeito
    private static boolean isPerfectSquareHelper(double n, double i) {
        if (i * i == n) {
            return true;
        }
        if (i * i > n) {
            return false;
        }

        return isPerfectSquareHelper(n, i + 1);
    }
}