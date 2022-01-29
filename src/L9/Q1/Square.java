package L9.Q1;

public class Square extends Shape{
    private double sideLength;

    public Square( double sideLength) {
        this.sideLength = sideLength;
        computePerimeter();
        computeArea();
    }

    public Square(String name, double sideLength) {
        this(sideLength);
        this.name = name;
    }

    public void input(int sideLength){
        this.sideLength = sideLength;
    }

    public void computePerimeter() {
        this.perimeter = 4 * sideLength;
    }

    public void computeArea() {
        this.area = Math.pow(this.sideLength,2);
    }
}
