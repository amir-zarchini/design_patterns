import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ShapeFactory extends AbstractShapeFactory {
    @Override
    public Shape getShape(String type) {
        switch (type.toLowerCase()) {
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                throw new NotImplementedException();
        }
    }
}
