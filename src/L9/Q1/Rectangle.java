package L9.Q1;

public class Rectangle extends Shape{
    private double length, width;

    public Rectangle( double length, double width) {
        this.length = length;
        this.width = width;
        computePerimeter();
        computeArea();
    }

    public Rectangle( String name, double length, double width) {
        this (length, width);
        this.name = name;
    }

    public void input( int length ,int width){
        this.length = length;
        this.width = width;

    }
    public void computePerimeter() {
        this.perimeter = 2 * (length + width);
    }

    public void computeArea() {
        this.area = length * width;
    }
}
