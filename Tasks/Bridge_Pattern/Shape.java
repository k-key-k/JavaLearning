package Tasks.Bridge_Pattern;

public abstract class Shape {
    protected Color color; // Bridge

    public Shape(Color color) {
        this.color = color;
    }
    public abstract void draw();
}
