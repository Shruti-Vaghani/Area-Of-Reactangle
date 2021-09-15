import exceptions.rectangle.RectangleAreaUpperLimitException;
import exceptions.rectangle.RectangleArgumentException;

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
        if(isAreaOverFlowing()) {
            throw new RectangleAreaUpperLimitException("Area of rectangle overflown upper limit of double");
        }
        return width * height;
    }

    private boolean isAreaOverFlowing(){
        return (width > 0) && (Double.MAX_VALUE / width < height);
    }
}
