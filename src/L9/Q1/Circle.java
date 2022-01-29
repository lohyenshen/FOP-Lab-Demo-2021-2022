package L9.Q1;

public class Circle extends Shape{
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
        computePerimeter();
        computeArea();
    }

    public Circle(String name, double diameter) {
        this(diameter);
        this.name = name;
    }
    public void input(int diameter){
        this.diameter = diameter;
    }

    public void computePerimeter() {
        this.perimeter =  Math.PI * this.diameter;
    }

    public void computeArea() {
        this.area = Math.PI * Math.pow((this.diameter / 2), 2);
    }
}
