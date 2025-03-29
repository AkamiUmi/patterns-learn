package visitor;

import visitor.shapes.Circle;
import visitor.shapes.CompoundShape;
import visitor.shapes.Dot;
import visitor.shapes.Rectangle;
import visitor.shapes.Shape;

public class XMLExportVisitor implements Visitor {
  public String export(Shape... args) {
    StringBuilder sb = new StringBuilder();
    sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "\n");
    for (Shape shape : args) {
      sb.append(shape.accept(this)).append("\n");
    }
    return sb.toString();
  }

  @Override
  public String visitDot(Dot dot) {
    return "<dot>" + "\n" +
      "   <id>" + dot.getId() + "</id>" + "\n" +
      "   <x>" + dot.getX() + "</x>" + "\n" +
      "   <y>" + dot.getY() + "</y>" + "\n" +
      "</dot>";
  }

  @Override
  public String visitorCircle(Circle circle) {
    return "<circle>" + "\n" +
      "   <id>" + circle.getId() + "</id>" + "\n" +
      "   <x>" + circle.getX() + "</x>" + "\n" +
      "   <y>" + circle.getY() + "</y>" + "\n" +
      "   <radius>" + circle.getRadius() + "</radius>" + "\n" +
      "</circle>";
  }

  @Override
  public String visitRectangle(Rectangle r) {
    return "<rectangle>" + "\n" +
      "    <id>" + r.getId() + "</id>" + "\n" +
      "    <x>" + r.getX() + "</x>" + "\n" +
      "    <y>" + r.getY() + "</y>" + "\n" +
      "    <width>" + r.getWidth() + "</width>" + "\n" +
      "    <height>" + r.getHeight() + "</height>" + "\n" +
      "</rectangle>";
  }

  @Override
  public String visitCompoundGraphic(CompoundShape cg) {
    return "<compound_graphic>" + "\n" +
      "   <id>" + cg.getId() + "</id>" + "\n" +
      _visitCompoundGraphic(cg) +
      "</compound_graphic>";
  }

  private String _visitCompoundGraphic(CompoundShape cg) {
    StringBuilder sb = new StringBuilder();
    for (Shape shape : cg.children) {
      String obj = shape.accept(this);
      obj = "    " + obj.replace("\n", "\n    ") + "\n";
      sb.append(obj);
    }
    return sb.toString();
  }


}
