public class BorderThicknessDecorator extends ShapeDecorator {

    private float thickness;

    public BorderThicknessDecorator(Shape decoratedShape, float thickness) {
        super(decoratedShape);
        this.thickness = thickness;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Border thickness: " + thickness);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }
}
