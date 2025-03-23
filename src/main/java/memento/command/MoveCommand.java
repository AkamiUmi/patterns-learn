package memento.command;

import memento.editor.Editor;
import memento.shapes.Shape;

public class MoveCommand implements Command {
  private Editor editor;
  private int startX, startY;
  private int endX, endY;

  public MoveCommand(Editor editor) {
    this.editor = editor;
  }

  public void start(int x, int y) {
    startX = x;
    startY = y;
    for (Shape child : editor.getShapes().getSelected()) {
      child.drag();
    }
  }
  @Override
  public String getName() {
    return "Move by X:" + (endX - startX) + " Y:" + (endY - startY);
  }


  @Override
  public void execute() {

  }
}
