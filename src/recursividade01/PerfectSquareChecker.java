package recursividade01;

public class PerfectSquareChecker {
  public static void main(String[] args) {
      double[] testNumbers = { 4, 9, 16, 23, 25, 30, 36 };

      for (double num : testNumbers) {
          System.out.println(num + " é um quadrado perfeito? " + PerfectSquareUtil.isPerfectSquare(num));
      }
  }
}
