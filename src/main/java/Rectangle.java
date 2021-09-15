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
    public double area(){
        // Validate width and height
        if(width > 0 && height >0) {
            return width * height;
        }
        return 0;
    }
}
