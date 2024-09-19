package fibonacci;

public class fibonacciClass {

  fibonacciClass(){
  }
  public void nf(int elemento){
    gerarCodigo(0, 1, elemento);
  }

  public void gerarCodigo(int r, int s, int elemento){

    if(elemento <= 1){
      System.out.print(r);
      return;
    }
    System.out.print(r);
    System.out.print(",");
    gerarCodigo(s, r+s, elemento-1);
  }

  @Override
  public String toString() {
    return "fibonacciClass [" ;
  }
}
