public class DecoratorDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.draw();
        System.out.println();

        Shape rectangle = new Rectangle();
        rectangle.draw();
        System.out.println();

        Shape circle2 = new FillColorDecorator(
                new BorderColorDecorator(
                        new BorderStyleDecorator(
                                new BorderThicknessDecorator(
                                        new Circle(),
                                        2
                                ),
                                LineStyle.SOLID
                        ),
                        Color.BLUE
                ),
                Color.RED
        );

        circle2.draw();
        System.out.println();

        Shape rectangle2 = new FillColorDecorator(
                new BorderStyleDecorator(new Rectangle(), LineStyle.DASH),
                Color.GREEN
        );

        rectangle2.draw();

    }
}
