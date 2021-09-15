public class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area(){
        if(width > 0 && height >0) {
            return width * height;
        }
        return 0;
    }
}
