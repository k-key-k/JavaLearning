package Tasks.Visitor_Pattern.visitor;

import Tasks.Visitor_Pattern.shape.Circle;
import Tasks.Visitor_Pattern.shape.CompoundShape;
import Tasks.Visitor_Pattern.shape.Dot;
import Tasks.Visitor_Pattern.shape.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);
    String visitCircle(Circle circle);
    String visitRectangle(Rectangle rectangle);
    String visitCompoundGraphic(CompoundShape cg);
}
