public class Circle implements Shape {

    private int x;
    private int y;
    private int r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
        System.out.println(String.format("Move circle to (%d, %d)", x, y));
    }

    @Override
    public void draw() {
        System.out.println(String.format("Draw a circle at (%d, %d) with R %d", x, y, r));
    }
}
