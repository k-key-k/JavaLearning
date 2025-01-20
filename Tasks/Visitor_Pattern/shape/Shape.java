package Tasks.Visitor_Pattern.shape;

import Tasks.Visitor_Pattern.visitor.Visitor;

public interface Shape {
    void mode(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
