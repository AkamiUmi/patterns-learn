package memento.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShape extends BaseShape{
  private List<Shape> children = new ArrayList<>();
  public CompoundShape(Shape... components) {
    super(0, 0, Color.BLACK);
    add(components);
  }

  public void add(Shape... components) {
    children.addAll(Arrays.asList(components));
  }

  public List<Shape> getSelected() {
    List<Shape> selected = new ArrayList<>();
    for (Shape child : children) {
      if (child.isSelected()) {
        selected.add(child);
      }
    }
    return selected;
  }
}
