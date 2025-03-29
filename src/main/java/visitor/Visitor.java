package visitor;

import visitor.shapes.Circle;
import visitor.shapes.CompoundShape;
import visitor.shapes.Dot;
import visitor.shapes.Rectangle;

public interface Visitor {
  String visitDot(Dot dot);
  String visitorCircle(Circle circle);
  String visitRectangle(Rectangle rectangle);
  String visitCompoundGraphic(CompoundShape compoundShape);
}
