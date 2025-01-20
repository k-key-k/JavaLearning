package Tasks.Visitor_Pattern.shape;

import Tasks.Visitor_Pattern.visitor.Visitor;

public class Dot implements Shape {
    private int id;
    private int x;
    private int y;
    public Dot(){

    }

    public Dot(int id, int x, int y){
        this.id = id;
        this.x = x;
        this.y = y;
    }
    @Override
    public void mode(int x, int y) {
        x += x;
        y += y;
    }

    @Override
    public void draw() {

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getId() {
        return id;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitDot(this);
    }
}
