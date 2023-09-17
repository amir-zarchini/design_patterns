public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing circle");
    }
}
