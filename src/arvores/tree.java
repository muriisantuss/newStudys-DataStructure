package arvores;

public class tree<T> {
  private Node<T> root;

  public tree() {
  }

  public tree(Node<T> root) {
    this.root = root;
  }

  public void add(T info) {
    // verificação se a raiz está vazia
    if (root == null) {
      this.root = new Node<>(info);
      return;
    }
    if (root.getLeft() == null) {
      //verificação se a sub-arvore da esquerda
      root.setLeft(new Node<>(info));
      return;
    }
    if (root.getRight() == null) {
      //verificação se a sub-arvore da direita
      root.setRight(new Node<>(info));
      return;
    } 
    // CENAS DOS PRÓXIMOS CAPITULOS...   
  }

}
