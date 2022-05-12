package entities;

public class Rectangle {

    private Double width;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double area() {
        return height * width;
    }

    public Double perimeter() {
        return 2 * (width + height);
    }

    public Double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public String toString() {
        return "AREA = "
                + String.format("%.2f%n", area())
                + "PERIMETER = "
                + String.format("%.2f%n", perimeter())
                + "DIAGONAL = "
                + String.format("%.2f%n", diagonal());
    }

}
