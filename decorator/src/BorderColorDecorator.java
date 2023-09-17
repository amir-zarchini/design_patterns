public class BorderColorDecorator extends ShapeDecorator {

    private Color color;

    public BorderColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Border color: " + color);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }
}
