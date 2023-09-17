public class CompositeDemo {


    public static void main(String[] args) {

        Shape circle1 = new Circle(0, 0, 5);
        Shape circle2 = new Circle(3, 5, 10);
        Shape dot = new Dot(10, 20);

        CompoundShape shapes = new CompoundShape();
        shapes.addChild(circle1);
        shapes.addChild(circle2);
        shapes.addChild(dot);

        shapes.draw();
        shapes.move(5, -3);
        shapes.draw();
    }
}
