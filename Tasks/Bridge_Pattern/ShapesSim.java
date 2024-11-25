package Tasks.Bridge_Pattern;

public class ShapesSim {
    public static void main(String[] args) {

        Shape triangleBlack = new Triangle(new BlackColor());
        Shape triangleGreen = new Triangle(new GreenColor());
        Shape rectangleGreen = new Rectangle(new GreenColor());

        triangleBlack.draw();
        triangleGreen.draw();
        rectangleGreen.draw();
    }
}
