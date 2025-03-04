package uz.akamiumi;

abstract public class BinaryExpression  implements Expression {

  protected final Expression left;
  protected final Expression right;

  public BinaryExpression(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }
}
