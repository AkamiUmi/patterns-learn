package composite;

import org.junit.jupiter.api.Test;
import uz.akamiumi.Expression;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompositeTest {

  @Test
  void testConstant() {
    double testValue = 3.0;
    Expression e = new Constant(testValue);
    assertEquals(testValue, e.getValue(), 0.0);
  }

  @Test
  void testAdder() {
    double testValueA = 2.0;
    double testValueB = 4.0;
    Expression left = new Constant(testValueA);
    Expression right = new Constant(testValueB);
    Expression e = new Adder(left, right);
    assertEquals((testValueA + testValueB), e.getValue(), 0.0);
  }
  @Test
  void testSubtracter() {
    double testValueA = 2.0;
    double testValueB = 4.0;
    Expression left = new Constant(testValueA);
    Expression right = new Constant(testValueB);
    Expression e = new Subtracter(left, right);
    assertEquals((testValueA - testValueB), e.getValue(), 0.0);
  }
  @Test
  void testDivider() {
    double testValueA = 2.0;
    double testValueB = 4.0;
    Expression left = new Constant(testValueA);
    Expression right = new Constant(testValueB);
    Expression e = new Divider(left, right);
    assertEquals((testValueA / testValueB), e.getValue(), 0.0);
  }
  @Test
  void testMultiplier() {
    double testValueA = 2.0;
    double testValueB = 4.0;
    Expression left = new Constant(testValueA);
    Expression right = new Constant(testValueB);
    Expression e = new Multiplier(left, right);
    assertEquals((testValueA * testValueB), e.getValue(), 0.0);
  }

  @Test
  void testComplexExpression() {
    Expression e =
      new Divider(
        new Multiplier(
          new Adder(new Constant(3.0), new Constant(5.0)), //LEFT
            new Constant(100.0)
          ),
          new Adder(new Constant(2.0), new Constant(64.0)) //RIGHT
          );
    assertEquals(12.12121212, e.getValue(), 0.000001);
  }
}
