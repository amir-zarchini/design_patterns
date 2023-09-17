public class Dot implements Shape {

    private int x;
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
        System.out.println(String.format("Move dot to (%d, %d)", x, y));
    }

    @Override
    public void draw() {
        System.out.println(String.format("Draw a dot at (%d, %d)", x, y));
    }
}
