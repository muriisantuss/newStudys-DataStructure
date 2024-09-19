package arvores;

public class Node<T> {
  private Node<T> left;
  private Node<T> right;
  private T info;

  public Node(){
    this.left = null;
    this.right = null;
    this.info = null;
  }

  public Node(T info) {
    this.info = info;
  }

  public Node(Node<T> left, Node<T> right, T info) {
    this.left = left;
    this.right = right;
    this.info = info;
  }

  public Node<T> getLeft() {
    return left;
  }

  public void setLeft(Node<T> left) {
    this.left = left;
  }

  public Node<T> getRight() {
    return right;
  }

  public void setRight(Node<T> right) {
    this.right = right;
  }

  public T getInfo() {
    return info;
  }

  public void setInfo(T info) {
    this.info = info;
  }

}
