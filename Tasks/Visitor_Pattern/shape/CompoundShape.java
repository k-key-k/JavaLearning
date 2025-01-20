package Tasks.Visitor_Pattern.shape;

import Tasks.Visitor_Pattern.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape{
    public int id;
    public List<Shape> children = new ArrayList<Shape>();
    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void mode(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public int getId() {
        return id;
    }

    public void add(Shape shape) {
        children.add(shape);
    }
}
