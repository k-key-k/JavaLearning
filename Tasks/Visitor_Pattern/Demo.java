package Tasks.Visitor_Pattern;

import Tasks.Visitor_Pattern.shape.*;
import Tasks.Visitor_Pattern.visitor.ExportVisitor;

public class Demo {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 22);
        Circle circle = new Circle(2, 22, 50, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 40);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape C = new CompoundShape(5);
        C.add(dot);
        compoundShape.add(C);

        export(circle, compoundShape);
    }
    private static void export(Shape... shapes) {
        ExportVisitor exportVisitor = new ExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}

