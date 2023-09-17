public class BorderStyleDecorator extends ShapeDecorator {

    private LineStyle borderStyle;

    public BorderStyleDecorator(Shape decoratedShape, LineStyle borderStyle) {
        super(decoratedShape);
        this.borderStyle = borderStyle;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Border style: " + borderStyle);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }
}
