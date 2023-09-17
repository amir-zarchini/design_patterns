import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RoundedShapeFactory extends AbstractShapeFactory {
    @Override
    public Shape getShape(String type) {
        switch (type.toLowerCase()) {
            case "rectangle":
                return new RoundedRectangle();
            case "square":
                return new RoundedSquare();
            default:
                throw new NotImplementedException();
        }
    }
}
