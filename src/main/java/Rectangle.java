import exceptions.rectangle.RectangleAreaUpperLimitException;
import exceptions.rectangle.RectangleArgumentException;
import exceptions.rectangle.RectanglePerimeterUpperLimitException;

public class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) throws RectangleArgumentException {
        if(width <= 0 || height <= 0){
            throw new RectangleArgumentException("Width and Height should be grater than zero");
        }
        this.width = width;
        this.height = height;

    }

    // Calculating area of rectangle
    public double area() throws RectangleAreaUpperLimitException {
        if(willAreaOverflow()) {
            throw new RectangleAreaUpperLimitException("Area of rectangle overflown upper limit of double");
        }
        return width * height;
    }


    public double perimeter() throws RectanglePerimeterUpperLimitException {
        if(willPerimeterOverflow()){
            throw new RectanglePerimeterUpperLimitException("Perimeter od rectangle overflow upper limit of double");

        }
        return 2 * (width + height);
    }

    private boolean willPerimeterOverflow(){
        return (width >= (Double.MAX_VALUE/2) - height);
    }

    private boolean willAreaOverflow(){
        return (width > 0) && (Double.MAX_VALUE / width < height);
    }
}
