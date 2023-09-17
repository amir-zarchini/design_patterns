import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ShapeFactory {

    public Shape getShape(String type) {

        Shape shape;

        switch (type.toLowerCase()) {
            case "rectangle":
                shape = new Rectangle();
                break;
            case "circle":
                shape = new Circle();
                break;
            case "square":
                shape = new Square();
                break;
            default:
                throw new NotImplementedException();
        }

        return shape;
    }
}
