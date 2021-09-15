public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double length) {
        this.width = width;
        this.height = length;
    }

    public double area(){
        if(width > 0 && height >0) {
            return width * height;
        }
        return 0;
    }
}
